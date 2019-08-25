package fairway.javabasic.Exception;

public class Run {

    public static void main(String[] args) {
        CheckAccount c = new CheckAccount();

        System.out.println("++ amount");
        c.deposit(500);

        try {
            System.out.println("--1000");
            c.withdraw(100);

            c.withdraw(500);
        } catch (InsufficientFundsException e){
            System.out.println("Sorry "+  e.getAmount());
        }

    }

}
