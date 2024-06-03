public class Main {
    public static void main(String[] args) {
        int currentBalance = 256;
        int bonusPer100Rubles = 1;
        int threshold = 1000;
        int depositAmount = 500;
        if (depositAmount > threshold) {
            int fullHundreds = (depositAmount / 100);
            int totalBonus = fullHundreds * bonusPer100Rubles;
            int newBalance = currentBalance + depositAmount + totalBonus;
            System.out.println("Бонусы начислены!");
            System.out.println("Итоговый баланс: " + newBalance + " рублей");
            System.out.println("Начислено бонусных рублей: " + totalBonus);
        } else {
            System.out.println("Итоговый баланс: " + (currentBalance + depositAmount) + " рублей");
            System.out.println("Бонусы не начислены.");
        }
    }
}
