package Lab6;

public class CheckingAccount extends Account{

    public CheckingAccount(String name){
        super(name);
    }

    @Override
    public double withdraw(double amount) {
        if (amount > getBalance()) {
            System.out.println("Your account has not enough money.");
            return getBalance();
        }

        return super.withdraw(amount);
    }
}
