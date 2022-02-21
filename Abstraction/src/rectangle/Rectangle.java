package rectangle;

public class Rectangle {
    private Point bottomLeft;
    private Point topRight;

    public Rectangle(Point bottomLeft, Point topRight) {
        this.bottomLeft = bottomLeft;
        this.topRight = topRight;
    }

    public boolean contains(Point point){
        boolean containsOnX = point.getX() >= bottomLeft.getX() &&
                point.getX() <= topRight.getX();

        boolean containsOnY = point.getY() >= bottomLeft.getY() &&
                point.getY() <= topRight.getY();

        return containsOnX && containsOnY;
    }
}
