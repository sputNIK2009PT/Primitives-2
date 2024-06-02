public class Main {
    public static void main(String[] args) {
        int currentBalance = 256;
        int bonusPer100Rubles = 1;
        int threshold = 1000;
        //Сценарий №1
        System.out.println ("Сценарий №1");
        int depositAmount = 2500;
        if (depositAmount > threshold) {
            int fullHundreds = (depositAmount / 100);
            int totalBonus = fullHundreds * bonusPer100Rubles;
            int newBalance = currentBalance + depositAmount + totalBonus;
            System.out.println("Бонусы начислены!");
            System.out.println("Итоговый баланс: " + newBalance + " рублей");
            System.out.println("Начислено бонусных рублей: " + totalBonus);
        } else {
            System.out.println("Итоговый баланс: " + (currentBalance + depositAmount) + "рублей");
            System.out.println("Бонусы не начислены.");
        }
        //Сценарий №2
        System.out.println ("Сценарий №2");
        int depositAmount2 = 200;
        if (depositAmount2 > threshold) {
            int fullHundreds = (depositAmount2 / 100);
            int totalBonus = fullHundreds * bonusPer100Rubles;
            int newBalance = currentBalance + depositAmount2 + totalBonus;
            System.out.println("Бонусы начислены!");
            System.out.println("Итоговый баланс: " + newBalance + " рублей");
            System.out.println("Количество бонусных рублей: " + totalBonus);
        } else {
            System.out.println("Итоговый баланс: " + (currentBalance + depositAmount2) + " рублей");
            System.out.println("Бонусы не начислены.");
        }
    }
}
