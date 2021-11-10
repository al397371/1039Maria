package Command.commands;

import Command.BeeBot;
import Command.Command;

public class Delete implements Command {
    private BeeBot beeBot;

    public Delete(BeeBot beeBot) {
        this.beeBot = beeBot;
    }

    @Override
    public void execute() {
        beeBot.delete();
    }

}
