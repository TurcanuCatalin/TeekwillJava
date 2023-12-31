package Interfaces;

public class MovablePoint implements Movable{
    int x;
    int y;
    int xSpeed;
    int ySpeed;
    public MovablePoint(int x, int y, int xSpeed, int ySpeed){
        this.x = x;
        this.y = y;
        this.xSpeed =xSpeed;
        this.ySpeed =ySpeed;

    }

    @Override
    public String toString() {
        return "MovablePoint{" +
                "x=" + x +
                ", y=" + y +
                ", xSpeed=" + xSpeed +
                ", ySpeed=" + ySpeed +
                '}';
    }

    @Override
    public void moveUp() {
        System.out.println("point moved up");
    }

    @Override
    public void moveDown() {
        System.out.println("point moved down");
    }

    @Override
    public void moveLeft() {
        System.out.println("point moved left");
    }

    @Override
    public void moveRight() {
        System.out.println("point moved right");
    }
}
