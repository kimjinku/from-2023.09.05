public class m10 {
    public static void main(String[] args) {

        Account a1 = new Account();

        a1.deposit(1000); // 1000원을 예금했습니다.
        a1.deposit(2000); // 1000원을 예금했습니다.
        a1.deposit(3000); // 1000원을 예금했습니다.

        int money = a1.withdraw(400);
        System.out.println(money); // 400

        int remainder = a1.getRemainder();
        System.out.println(remainder); // 5600

        money = a1.withdraw(1400);
        System.out.println(money); // 1400

        remainder = a1.getRemainder();
        System.out.println(remainder); // 4200
    }
}
class Account{
    int balance=0;





    public int deposit(int n) {

        balance += n;
        System.out.printf("%d원을 예금했습니다\n", n);

        return n;

    }
    public int withdraw(int m){
        balance -= m;


        return m;

    }
    public int getRemainder(){




        return balance;



    }
}
