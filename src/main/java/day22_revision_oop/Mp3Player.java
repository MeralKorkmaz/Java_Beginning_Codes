package day22_revision_oop;

public class Mp3Player implements MusicPlayer {
    @Override
    public void play() {
        System.out.println("Mp3Player plays...");
    }

    @Override
    public void stop() {
        System.out.println("Mp3Player stops...");
    }

    @Override
    public void pause() {
        System.out.println("Mp3Player pauses...");
    }

    @Override
    public void skippForward() {
        System.out.println("Mp3Player skipp forward...");
    }

    @Override
    public void skippBacward() {
        System.out.println("Mp3Player skipp backward...");
    }
}


