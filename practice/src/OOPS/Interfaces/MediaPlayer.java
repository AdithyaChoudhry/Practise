package OOPS.Interfaces;

public class MediaPlayer implements Media{
    @Override
    public void start() {
        System.out.println("Music Started");
    }

    @Override
    public void stop() {
        System.out.println("Music Stopped");
    }
}
