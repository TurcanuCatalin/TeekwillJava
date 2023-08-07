package Interfaces;

public class MovableCircle implements Movable{
    private int radius;
    private MovablePoint center;

    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius){

        this.radius = radius;
    }

    @Override
    public String toString() {
        return "MovableCircle{" +
                "radius=" + radius +
                ", center=" + center +
                '}';
    }

    @Override
    public void moveUp() {
        System.out.println("circle moved up");
    }

    @Override
    public void moveDown() {
        System.out.println("circle moved down");
    }

    @Override
    public void moveLeft() {
        System.out.println("circle moved left");
    }

    @Override
    public void moveRight() {
        System.out.println("circle moved right");
    }
}
