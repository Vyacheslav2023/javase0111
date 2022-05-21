package ru.javalang.module17.p10Command;

public class CommandApplication {
    public static void main(String[] args) {

        Computer computer = new Computer();
        User user = new User(new StartCommand(computer),new StopCommand(computer),new ResetCommand(computer));
        user.startComputer();
        user.stopComputer();
        user.resetComputer();


    }
}

interface Command{
    void execute();
}

//Receiver is a class Computer

class Computer {

    void start(){
        System.out.println("Start Computer (switch on)");

    }

    void stop(){
        System.out.println("Stop Computer (switch off)");
    }

    void reset(){
        System.out.println("Reset Computer");
    }
}

//Concrete Command (look like Delegate pattern) - Start

class StartCommand implements Command {

    Computer computer;

    public StartCommand(Computer computer) {
        this.computer = computer;
    }

    @Override
    public void execute() {
        computer.start();
    }
}

//Concrete Command (look like Delegate pattern) - Stop

class StopCommand implements Command {

    Computer computer;

    public StopCommand(Computer computer) {
        this.computer = computer;
    }

    @Override
    public void execute() {
        computer.stop();
    }
}

//Concrete Command (look like Delegate pattern) - Reset

class ResetCommand implements Command {

    Computer computer;

    public ResetCommand(Computer computer) {
        this.computer = computer;
    }

    @Override
    public void execute() {
        computer.reset();
    }
}



//Invoker
class User {
    Command start;
    Command stop;
    Command reset;

    public User(Command start, Command stop, Command reset) {
        this.start = start;
        this.stop = stop;
        this.reset = reset;
    }

    void startComputer(){
        start.execute();
    }

    void stopComputer(){
        stop.execute();
    }

    void resetComputer(){
        reset.execute();
    }
}