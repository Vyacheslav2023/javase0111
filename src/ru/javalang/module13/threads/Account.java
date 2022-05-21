package ru.javalang.module13.threads;

//Класс для демонстрации потокоНЕзащищенных полей и методов

public class Account {

    //Баланс
    private long balance;

    public long getBalance() {
        return balance;
    }

    //Пустой конструктор
    private Account() { this(0L); }

    //Конструктор с заданием баланса
    public Account(long balance) { this.balance = balance; }

    //Метод увеличения баланса на величину (amount), передаваемую в параметре
    public void deposit(long amount){
        checkAmountNonNegative(amount);
        balance += amount;
    }

    //Метод уменьшение баланса на величину (amount), передаваемую в параметре
    public void withdraw(long amount){
        checkAmountNonNegative(amount);
        if (balance < amount)
        {
            throw new IllegalArgumentException("not enough money");
        }
        balance -= amount;
    }

    //Проверка значения на положительное число
    private static void checkAmountNonNegative(long amount){
        if(amount < 0){
            throw new IllegalArgumentException("not enough money");
        }
    }
}
