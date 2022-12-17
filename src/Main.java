public class Main {
    public static void main(String[] args) {

        int repamount = 500;
        int amount = 100;
        int bonus;
        int finamount;
        if (repamount >= 1000) {
            bonus = (repamount / 100);
            finamount = (amount + repamount + bonus);
            System.out.println("Balance=" + finamount);
            System.out.println("Bonus=" + bonus);
        } else {
            finamount = (amount + repamount);
            bonus = 0;
            System.out.println("Balance=" + finamount);
            System.out.println("Bonus=" + bonus);
        }

    }
}