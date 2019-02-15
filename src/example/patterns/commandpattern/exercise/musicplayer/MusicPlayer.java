package example.patterns.commandpattern.exercise.musicplayer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class MusicPlayer {

    List<String> tracks = Arrays.asList("track 1", "track 2", "track 3");
    int currentTrackNr = 0;

    public void playNextTrack(){
        currentTrackNr++;
        if(currentTrackNr > 2){
            currentTrackNr = 0;
        }

        System.out.println("Playing next track: " + tracks.get(currentTrackNr));
    }

    public void playFirstTrack(){
        System.out.println("Playing first track: " + tracks.get(0));
    }

    public void playRandomTrack(){
        currentTrackNr = ThreadLocalRandom.current().nextInt(0,3);
        System.out.println("Playing random track: " + tracks.get(currentTrackNr));
    }
}
