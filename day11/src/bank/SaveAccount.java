package bank;

public class SaveAccount extends BankAccount{

    private double interestRate;

    public SaveAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void addInterest() {
        double interest = balance * interestRate / 100;
        balance += interest;
        System.out.println("이자 입금 : " + interest);

    }
}
