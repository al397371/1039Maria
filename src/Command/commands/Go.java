package Command.commands;

import Command.BeeBot;
import Command.Command;

public class Go implements Command {
    private BeeBot beeBot;

    public Go(BeeBot beeBot) {
        this.beeBot = beeBot;
    }

    @Override
    public void execute() {
        beeBot.go();
    }

}
