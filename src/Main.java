public class Main {
    public static void main(String[] args) {

        int balance = 100;
        int summa_popolneniya = 1100;
        int bonus = 0;

        if (summa_popolneniya > 1000) {
            bonus += summa_popolneniya / 100;
        }
        System.out.println(balance + summa_popolneniya + bonus);
        System.out.println(bonus);
        // Условным оператором проверяете, превысила ли
        // сумма пополнения порог, и для этих двух разных
        // сценариев рассчитываете сумму бонуса и выводите
        // на экран.
    }
}