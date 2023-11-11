package day22_revision_oop;

public interface MusicPlayer {
    /*
    Imagine you want to create a code for various music player devices
(MobilePhone and Mp3Player)in a music playback application. This code should
include basic functions like
        playing music,
        pausing,
        stopping,.
        skipping forward,
        and skipping backward.
Additionally, each music player device should implement these functions
using their own methods
     */
    void play();
    void stop();
    void pause();
    void skippForward();
    void skippBacward();
}



