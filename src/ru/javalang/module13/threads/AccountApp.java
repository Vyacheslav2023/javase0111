package ru.javalang.module13.threads;

//Класс для тестовой демонстрации системы расчета - инкремент-декремент
//Без потокозащищенности

public class AccountApp {
    public static void main(String[] args) {
        Account account = new Account(100_000);
        Thread withdrawThread = new WithDrawThread(account);
        Thread depositThread = new DepositThread(account);
        withdrawThread.start();
        depositThread.start();
        System.out.println("Stop balance = " + account.getBalance());
    }
    private static class WithDrawThread extends Thread {
        private final Account account;

        private WithDrawThread(Account account) {
            this.account = account;
        }

        public void run() {
            for (int i = 0; i < 20_000; i++) {
                account.withdraw(1);
            }
        }
    }

    private static class DepositThread extends Thread {
        private final Account account;

        private DepositThread(Account account) {
            this.account = account;
        }

        public void run() {
            for (int i = 0; i < 20_000; i++) {
                account.deposit(1);
            }
        }

    }
}
