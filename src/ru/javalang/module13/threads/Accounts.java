package ru.javalang.module13.threads;

//Класс с потокозащищщенными методами

public class Accounts {

    //Баланс
    private long balance;

    public long getBalance() { return  balance; }

    //Пустой конструктор
    private Accounts() { this(0L); }


    //Конструктор с заданием баланса
    public Accounts(long balance) { this.balance = balance; }

    // 1) add synchronized to void deposit
    // 2) add synchronized(this)
    // 3) add notifyAll()
    public void deposit(long amount){
        checkAmountNonNegative(amount);
            balance += amount;
    }

    // 1) add synchronized
    // 2) add synchronized(this)
    public void withdraw(long amount){
        checkAmountNonNegative(amount);
            if (balance < amount)
            {
                throw new IllegalArgumentException("not enough money");
            }
            balance -= amount;
    }

    //2) add wait() and notifyAll()
    public synchronized void waitAndWithDraw(long amount) throws InterruptedException
    {
        checkAmountNonNegative(amount);
        while (balance < amount)
            wait();
    }

    private static void checkAmountNonNegative(long amount){
        if(amount < 0){
            throw new IllegalArgumentException("not enough money");
        }
    }
}
