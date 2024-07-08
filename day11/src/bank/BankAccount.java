package bank;

public class BankAccount {

    private String accountNumber;
    protected double balance;

    public BankAccount(){}
    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("입금완료");
        }else {
            System.out.println("금액이 잘못되었습니다.");
        }
    }

    public void withdraw(double amount) {
        if (amount >= 0 || amount <= balance) {
            balance -= amount;
            System.out.println("남은 금액은 " + balance + "원 입니다.");
        }else {
            System.out.println("출금 불가");
        }
    }

}
