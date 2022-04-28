public class Main {
    public static void main(String[] args) {

        int account = 100;
        int replenishment = 1100;
        int bonus = replenishment / 100;
        int accountTotal = account + replenishment;

        if (replenishment > 1000) {
            int accountTotalWithBonus = accountTotal + bonus;
            System.out.println("Поздравляем! Ваш бонус за пополнение счета составил: " + bonus);
            System.out.println("Сумма на вашем счету: " + accountTotalWithBonus);

        } else {
            System.out.println("Сумма на вашем счету: " + accountTotal);
        }
    }
}