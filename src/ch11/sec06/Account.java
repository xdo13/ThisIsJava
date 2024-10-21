package ch11.sec06;
//balance 잔고
//try catch 예외처리 샘플코드로 좋음
public class Account {
    private long balance;

    public Account() {
    }

    public long getBalance() {
        return balance;
    }

    public void deposit(int money){
        balance += money;
    }

    public void withdraw(int money) throws InsufficientException {
        if (balance < money) {
            throw new InsufficientException("잔고 부족: " + (money - balance) + " 모자람");
        }
        balance -= money;
    }
}
