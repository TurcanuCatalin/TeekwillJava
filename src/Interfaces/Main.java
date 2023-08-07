package Interfaces;

public class Main {
    public static void main(String[] args) {
//        MovablePoint point = new MovablePoint(4,7,12,9);
//        MovableCircle circle = new MovableCircle(4,7,12,9,10);
//
//        point.moveUp();
//        point.moveDown();
//        circle.moveLeft();
//        circle.moveRight();
//        System.out.println(point.toString());
//        System.out.println(circle.toString());
        Ball ball = new Ball();
        Rock rock = new Rock();
        Baseball baseball = new Baseball();
        Football football =new Football();

        ball.getBrandName();
        ball.Ball("Nike");
        baseball.Baseball("nike");
        baseball.bounce();
        football.toss();
        rock.toss();
    }

}
