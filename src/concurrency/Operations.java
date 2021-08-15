package concurrency;

import javax.naming.InsufficientResourcesException;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Operations {
    public static void main(String[] args) throws InsufficientResourcesException, InterruptedException {
        final Account a = new Account(1000);
        final Account b = new Account(2000);

        new Thread(() -> {
            try {
                transfer(a, b, 500);
            } catch (InsufficientResourcesException | InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
        transfer(b, a, 300);

    }

    static void transfer(Account acc1, Account acc2, int amount) throws InsufficientResourcesException, InterruptedException {
        if (acc1.getBalance() < amount) throw new InsufficientResourcesException();

        System.out.println("Service info: \naccount 1 balance "  + acc1.getBalance()
                + "\naccount 2 balance " + acc2.getBalance() + "\namount of withdraw is " + amount + "\n");

        synchronized (acc1) {
            Thread.sleep(1000);
            synchronized (acc2) {
                acc1.withdraw(amount);
                System.out.println("Withdraw successful, amount of money on account1 is " + acc1.getBalance());

                acc2.deposit(amount);
                System.out.println("Deposit successful, amount of money on account2 is " + acc2.getBalance() + "\n");
            }
        }

    }
}
