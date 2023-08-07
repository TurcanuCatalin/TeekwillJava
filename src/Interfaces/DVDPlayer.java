package Interfaces;

public class DVDPlayer implements Player {
    @Override
    public void play() {
        System.out.println("DVDPlayer play");
    }

    @Override
    public void stop() {
        System.out.println("DVDPlayer stop");
    }

    @Override
    public void pause() {
        System.out.println("DVDPlayer pause");
    }

    @Override
    public void reverse() {
        System.out.println("DVDPlayer reverse");
    }
}
