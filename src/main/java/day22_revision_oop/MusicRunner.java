package day22_revision_oop;

public class MusicRunner {
    public static void main(String[] args) {
        Mp3Player mp3Player = new Mp3Player();
        mp3Player.play();
        mp3Player.pause();
        MobilePhone mobilePhone = new MobilePhone();
        mobilePhone.play();
        mobilePhone.skippForward();
        mobilePhone.stop();
    }
}
