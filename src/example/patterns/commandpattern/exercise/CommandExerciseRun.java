package example.patterns.commandpattern.exercise;

import example.patterns.commandpattern.exercise.musicplayer.MusicPlayer;
import example.patterns.commandpattern.exercise.musicplayer.MusicPlayerRemote;
import example.patterns.commandpattern.exercise.musicplayer.commands.PlayFirstTrack;
import example.patterns.commandpattern.exercise.musicplayer.commands.PlayNextTrack;
import example.patterns.commandpattern.exercise.musicplayer.commands.PlayRandomTrack;

public class CommandExerciseRun {

    public static void main(String[] args) {
        MusicPlayer musicPlayer = new MusicPlayer();
        MusicPlayerRemote remote = new MusicPlayerRemote();
        remote.setMusicPlayerCommand(new PlayFirstTrack(musicPlayer));
        remote.pressButton();
        remote.setMusicPlayerCommand(new PlayNextTrack(musicPlayer));
        remote.pressButton();
        remote.pressButton();
        remote.pressButton();
        remote.setMusicPlayerCommand(new PlayRandomTrack(musicPlayer));
        remote.pressButton();
        remote.pressButton();
    }
}
