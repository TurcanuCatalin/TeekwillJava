package Interfaces;

public class TapePlayer implements Recorder{
    @Override
    public void record() {
        System.out.println("Tape player record");
    }

    @Override
    public void play() {
        System.out.println("TapePlayer play");
    }

    @Override
    public void stop() {
        System.out.println("TapePlayer stop");
    }

    @Override
    public void pause() {
        System.out.println("TapePlayer pause");
    }

    @Override
    public void reverse() {
        System.out.println("TapePlayer reverse");
    }
}
