package bank;

public class Test {
    public static void main(String[] args) {
        /*BankAccount account = new BankAccount("111-222", 10000);

        account.deposit(1000);
        System.out.println(account.getBalance());

        account.withdraw(10000);
        System.out.println(account.getBalance());*/

        SaveAccount saveAccount = new SaveAccount("222-333", 10000, 2);
        saveAccount.deposit(20000);
        saveAccount.addInterest();
        saveAccount.withdraw(2000);
        System.out.println(saveAccount.getBalance());
    }
}
