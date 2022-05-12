public class Main {

    public static void main(String[] args) {

        int balance = 100;
        int replenished = 1100;
        int check = 100;
        int bonus;
        if (replenished > 1000) {
            bonus = replenished / check;
        } else {
            bonus = 0;
        }
        int general = balance + replenished + bonus;
        System.out.println("Баланс = " + general);
        System.out.println("Начислено бонусов = " + bonus);
    }
}
