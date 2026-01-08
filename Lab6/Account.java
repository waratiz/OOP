package Lab6;

import java.util.Date;

public class Account {

    private String name;
    private double balance = 0;
    private double interest_rate;
    private Date date;

    public Account(String name) {
        this.name = name;
    }

    public double deposit(double deposit) {

        if (deposit < 0) {
            System.out.println("Error");
            return 0;
        }

        balance += deposit;
        return balance;
    }

    public double withdraw(double withdraw){

        if(withdraw > balance){
            System.out.println("your withdraw can not process.");
            return 0;
        }

        balance-= withdraw;
        return balance;
    }

    public double getBalance() {
        return balance;
    }

}
