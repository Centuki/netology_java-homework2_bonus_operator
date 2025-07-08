public class Main {
    public static void main(String[] args) {

        int initialAccount = 100;
        int depositAmount = 1100;
        int bonus = 0;

        if (depositAmount > 1000) {
            bonus += depositAmount / 100;
        }
        System.out.println(initialAccount + depositAmount + bonus);
        System.out.println(bonus);
    }
}