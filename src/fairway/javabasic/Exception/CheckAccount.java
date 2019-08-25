package fairway.javabasic.Exception;

public class CheckAccount {

    private double balance;
    private int number;

    public void deposit(double amount){
        balance += amount;
    }

    public void withdraw(double amount) throws InsufficientFundsException {
        if(amount <= balance){
            balance -= amount;
        } else {
            double need = amount - balance;
            throw new InsufficientFundsException(need);
        }
    }

    public double getBalance() {
        return balance;
    }

    public int getNumber() {
        return number;
    }
}
