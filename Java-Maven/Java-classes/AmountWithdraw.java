public class AmountWithdraw {
    int balance;
    AmountWithdraw() {}
    AmountWithdraw(int balance) {
        if (balance<0) {
            throw new ArithmeticException("Enter positive value");
        }
        this.balance = balance;
    }
    void withdraw (int amt) {
        if (amt < 0) {
            throw new ArithmeticException("Enter positive value");
        }
        if (amt > balance) {
            throw new ArithmeticException("Insufficient Balance");
        }
        balance -= amt;
//        System.out.println("Balance: "+balance);
    }

//    public static void main(String[] args) {
//        AmountWithdraw a1 = new AmountWithdraw(5000);
//        a1.withdraw(-100);
//        a1.withdraw(500);
//        a1.withdraw(10000);
//    }
}
