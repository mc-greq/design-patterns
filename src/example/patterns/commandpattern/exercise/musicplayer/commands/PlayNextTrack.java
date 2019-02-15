package example.patterns.commandpattern.exercise.musicplayer.commands;

import example.patterns.commandpattern.exercise.musicplayer.MusicPlayer;

public class PlayNextTrack implements MusicPlayerCommand{

    MusicPlayer musicPlayer;

    public PlayNextTrack(MusicPlayer musicPlayer) {
        this.musicPlayer = musicPlayer;
    }

    @Override
    public void play() {
        musicPlayer.playNextTrack();
    }
}
