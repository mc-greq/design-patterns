package example.patterns.commandpattern.exercise.musicplayer;

import example.patterns.commandpattern.exercise.musicplayer.commands.MusicPlayerCommand;

public class MusicPlayerRemote {

    private MusicPlayerCommand musicPlayerCommand;

    public void setMusicPlayerCommand(MusicPlayerCommand musicPlayerCommand) {
        this.musicPlayerCommand = musicPlayerCommand;
    }

    public void pressButton(){
        musicPlayerCommand.play();
    }
}
