package day22_revision_oop;

public class MobilePhone implements MusicPlayer{
    @Override
    public void play() {
        System.out.println("MobilePhone plays...");
    }
    @Override
    public void stop() {
        System.out.println("MobilePhone stops...");
    }
    @Override
    public void pause() {
        System.out.println("MobilePhone pauses...");
    }
    @Override
    public void skippForward() {
        System.out.println("MobilePhone skipp forward...");
    }
    @Override
    public void skippBacward() {
        System.out.println("MobilePhone skipp backward...");
    }
}
