package Account;

public class AccountMain {
    public static void main(String[] args) {
        AccountData data = new AccountData();

        data.deposit(10000);
        data.withdraw(9000);
        data.withdraw(2000);
        data.deposit(7000);

        System.out.println("잔액: " + data.balance);

    }
}
