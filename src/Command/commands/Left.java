package Command.commands;

import Command.BeeBot;
import Command.Command;

public class Left implements Command {

    private BeeBot beeBot;
    private String movimiento;

    public Left(BeeBot beeBot) {
        this.beeBot = beeBot;
        this.movimiento = "Giro a la izquierda";
    }

    @Override
    public void execute() {
        beeBot.mover(movimiento);
    }
}
