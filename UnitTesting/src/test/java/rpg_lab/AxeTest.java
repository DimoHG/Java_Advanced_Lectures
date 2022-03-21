package rpg_lab;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class AxeTest {

    @Test
    public void testAxeLosesDurabilityAfterAttack(){
        //Arrange
        Axe axe = new Axe(10, 10);
        Dummy dummy = new Dummy(10, 10);
        //Act
        axe.attack(dummy);
        //Assert
        Assert.assertEquals(9, axe.getDurabilityPoints());
    }

    @Test(expected = IllegalStateException.class)
    public void testAttackWithBrokenAxeShouldThrowException(){
        //Arrange
        Axe axe = new Axe(10, 0);
        Dummy dummy = new Dummy(10, 10);

        //Act
        axe.attack(dummy);
    }
}