package example.patterns.commandpattern.exercise.musicplayer.commands;

import example.patterns.commandpattern.exercise.musicplayer.MusicPlayer;

public class PlayRandomTrack implements MusicPlayerCommand {

    MusicPlayer musicPlayer;

    public PlayRandomTrack(MusicPlayer musicPlayer) {
        this.musicPlayer = musicPlayer;
    }

    @Override
    public void play() {
        musicPlayer.playRandomTrack();
    }
}
