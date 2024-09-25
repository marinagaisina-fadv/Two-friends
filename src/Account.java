public class Account {
    double balance;

    void debit (double amount){
        if (balance < amount){
            System.out.println("debit Exceeds the limit");
        } else {

            balance = balance - amount;
        }

    }

    public static void main(String[] args) {
        Account cheking = new Account();

        cheking.balance = 0;
        cheking.balance += 100;
        System.out.println(cheking.balance);

        cheking.debit(20);
        System.out.println(cheking.balance);

        cheking.debit(170);
        System.out.println(cheking.balance);

    }

}
