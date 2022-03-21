package rpg_lab;

import org.junit.Assert;
import org.junit.Test;

import java.rmi.server.ExportException;

import static org.junit.Assert.*;

public class DummyTest {

    @Test
    public void testAttackedDummyLosesHealth(){
        //Arrange
        Dummy dummy = new Dummy(100, 10);
        //Act
        dummy.takeAttack(20);
        //Assert
        Assert.assertEquals(80, dummy.getHealth());
    }

    @Test(expected = IllegalStateException.class)
    public void testAttackDeadDummyThrowsException(){
        Dummy dummy = new Dummy(0, 10);
        dummy.takeAttack(100);
    }

    @Test
    public void testDeadDummyGivesXP(){
        //Arrange
        Dummy dummy = new Dummy(0, 10);
        //Act
        int exp = dummy.giveExperience();
        //Assert
        Assert.assertEquals(10, exp);
    }

    @Test(expected = IllegalStateException.class)
    public void testAliveDummyDoesntGiveXP(){
        //Arrange
        Dummy dummy = new Dummy(100, 10);
        //Act
        dummy.giveExperience();
    }

}