package Command;


import Command.commands.*;

public class Cliente {
    public static void main(String[] args) {

        BeeBot beeBot = new BeeBot();

        Invoker invoker = new Invoker();
        invoker.setComand(new Forward(beeBot));
        invoker.executeCommand();

        invoker.setComand(new Back(beeBot));
        invoker.executeCommand();

        invoker.setComand(new Right(beeBot));
        invoker.executeCommand();

        invoker.setComand(new Left(beeBot));
        invoker.executeCommand();

        invoker.setComand(new Delete(beeBot));
        invoker.executeCommand();

        invoker.setComand(new Go(beeBot));
        invoker.executeCommand();
    }
}
