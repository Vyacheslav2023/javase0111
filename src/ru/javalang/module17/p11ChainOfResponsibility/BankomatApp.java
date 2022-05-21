package ru.javalang.module17.p11ChainOfResponsibility;

public class BankomatApp {
    public static void main(String[] args) {
        NoteModule note5000 = new NoteModule5000();
        NoteModule note1000 = new NoteModule1000();
        NoteModule note500 = new NoteModule500();
        NoteModule note100 = new NoteModule100();

        note5000.setNextMoneyModule(note1000);
        note1000.setNextMoneyModule(note500);
        note500.setNextMoneyModule(note100);

        note5000.takeMoney(new Money(197_050));
    }
}

class Note {
    public static final int R100 = 100;
    public static final int R500 = 500;
    public static final int R1000 = 1000;
    public static final int R5000 = 5000;
}

class Money {
    private int amt;

    public Money(int amt) {
        this.amt = amt;
    }

    public int getAmt() {
        return amt;
    }

    public void setAmt(int amt) {
        if(amt > 0 && amt <= 200_000 && amt%Note.R100 == 0)
            this.amt = amt;
        else
            throw new RuntimeException("Сумма денег должна быть не более 100 000 и кратная 100");
    }
}

abstract class NoteModule {

    protected NoteModule next;

    abstract void takeMoney(Money money);

    void setNextMoneyModule(NoteModule module){
        next = module;
    }
}

class NoteModule5000 extends NoteModule{

    @Override
    void takeMoney(Money money) {
        int countNote = money.getAmt()/Note.R5000;
        int remind = money.getAmt()%Note.R5000;
        if(countNote > 0)
            System.out.println("Выдано " + countNote + " купюр достоинством " + Note.R5000);
        if(remind > 0 && next != null)
            next.takeMoney(new Money(remind));
    }
}

class NoteModule1000 extends NoteModule{

    @Override
    void takeMoney(Money money) {
        int countNote = money.getAmt()/Note.R1000;
        int remind = money.getAmt()%Note.R1000;
        if(countNote > 0)
            System.out.println("Выдано " + countNote + " купюр достоинством " + Note.R1000);
        if(remind > 0 && next != null)
            next.takeMoney(new Money(remind));
    }
}

class NoteModule500 extends NoteModule{

    @Override
    void takeMoney(Money money) {
        int countNote = money.getAmt()/Note.R500;
        int remind = money.getAmt()%Note.R500;
        if(countNote > 0)
            System.out.println("Выдано " + countNote + " купюр достоинством " + Note.R500);
        if(remind > 0 && next != null)
            next.takeMoney(new Money(remind));
    }
}


class NoteModule100 extends NoteModule{

    @Override
    void takeMoney(Money money) {
        int countNote = money.getAmt()/Note.R100;
        int remind = money.getAmt()%Note.R100;
        if(countNote > 0)
            System.out.println("Выдано " + countNote + " купюр достоинством " + Note.R100);
        if(remind > 0 && next != null)
            next.takeMoney(new Money(remind));
    }
}