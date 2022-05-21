package ru.javalang.module13.threads;

// Класс для демонстрации системы расчета.
// Используются подклассы с применением потокозащищенности

public class AccountsApp {
    public static void main(String[] args) throws InterruptedException
    {
        //Создание объекта с первоначальным балансом 100_000
        Accounts accounts = new Accounts(100_000);
        System.out.println("Start balance = " + accounts.getBalance());

        //Объект по работе со снятием средств со счета
        Thread withdrawThread = new WithDrawThread(accounts);

        //Объект по работе с внесением средств
        Thread depositThread = new DepositThread(accounts);

        //Запуск потока на снятие средств
        withdrawThread.start();

        //Запуск потока на внесение средств
        depositThread.start();

        //Ожидание завершения потока по снятию средств
        withdrawThread.join();

        //Ожидание завершения потока по внесению средств
        depositThread.join();

        System.out.println("Stop balance = " + accounts.getBalance());
    }

    //Класс для снятия средств
    private static class WithDrawThread extends Thread{

        //Объявление переменной типа счет
        private final Accounts accounts;

        //Конструктор класса для снятия средств
        private WithDrawThread(Accounts accounts)
        {
            this.accounts = accounts;
        }

        //Метод для создания потока по снятию средств, использующий метод самого счета
        public void run(){
            for (int i = 0; i < 20_000; i++)
            {
                accounts.withdraw(1);
            }
        }
    }

    //Класс по внесению средств
    private static class DepositThread extends Thread{

        //Объявление переменной типа СЧЕТ
        private final Accounts accounts;

        //Конструктор класса для внесения средств
        private DepositThread(Accounts accounts){
            this.accounts = accounts;
        }

        //Метод для создания потока по внесению средств, использующий метод самого счета
        public void run(){
            for (int i = 0; i < 20_000; i++)
            {
                accounts.deposit(1);
            }
        }

    }
}
