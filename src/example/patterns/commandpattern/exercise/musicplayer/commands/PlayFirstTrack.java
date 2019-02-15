package example.patterns.commandpattern.exercise.musicplayer.commands;

import example.patterns.commandpattern.exercise.musicplayer.MusicPlayer;

public class PlayFirstTrack implements MusicPlayerCommand {

    MusicPlayer musicPlayer;

    public PlayFirstTrack(MusicPlayer musicPlayer) {
        this.musicPlayer = musicPlayer;
    }

    @Override
    public void play() {
        musicPlayer.playFirstTrack();
    }
}
