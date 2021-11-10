package Command.commands;

import Command.BeeBot;
import Command.Command;

public class Back implements Command {

    private BeeBot beeBot;
    private String movimiento;

    public Back(BeeBot beeBot) {
        this.beeBot = beeBot;
        this.movimiento = "Hacia atrás";
    }

    @Override
    public void execute() {
        beeBot.mover(movimiento);
    }
}
