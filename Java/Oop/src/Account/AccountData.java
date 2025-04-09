package Account;

public class AccountData {
    int balance;

    void deposit(int amount){
        balance += amount;
        System.out.println(amount + "원 입금 완료. 현재 잔액: " + balance + "원.");

    }

    void withdraw(int amount){
        if (balance >= amount) {
            balance -= amount;
            System.out.println(amount +"원 출금 완료. 현재 잔액: " + balance+ "원.");
        } else{
            System.out.println(amount + "원 출금 실패. 잔액이 부족합니다. 현재 잔액: " + balance + "원.");

        }
    }

}
