package Command.commands;

import Command.BeeBot;
import Command.Command;

public class Forward implements Command {

    private BeeBot beeBot;
    private String movimiento;

    public Forward(BeeBot beeBot) {
        this.beeBot = beeBot;
        this.movimiento = "Hacia delante";
    }

    @Override
    public void execute() {
        beeBot.mover(movimiento);
    }
}
