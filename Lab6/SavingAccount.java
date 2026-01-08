package Lab6;

public class SavingAccount extends Account {

    public static final int MAX_WITHDRAW = 5;
    private int count = 0;

    public SavingAccount(String name) {
        super(name);
    }

    @Override
    public double withdraw(double amount) {
        if (count >= MAX_WITHDRAW) {
            System.out.println("This month you attemt to withdraw 6 times.");
            return 0;
        }

        if (amount > getBalance()) {
            System.out.println("Your withdraw can not process.");
            System.out.println("This month you attemp to withdraw 1 times.");
            return getBalance();
        }

        count++;

        double result = super.withdraw(amount);
        System.out.println(count);
        System.out.println(result);

        return result;
    }
}
