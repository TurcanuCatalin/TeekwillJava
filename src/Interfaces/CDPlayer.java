package Interfaces;

public class CDPlayer implements Player{
    @Override
    public void play() {
        System.out.println("CDPlayer play");
    }

    @Override
    public void stop() {
        System.out.println("CDPlayer stop");
    }

    @Override
    public void pause() {
        System.out.println("CDPlayer pause");
    }

    @Override
    public void reverse() {
        System.out.println("CDPlayer reverse");
    }
}
