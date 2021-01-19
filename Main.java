public class Main {
    public static void main(String[] args) {
        int bonus;
        int account = 100;
        int refill = 1100;
        if (refill>1000) {
            bonus = refill / 100;
        } else {
            bonus = 0;
        }
        account = account+refill+bonus;

        System.out.println(account);
        System.out.println(bonus);

    }
}
