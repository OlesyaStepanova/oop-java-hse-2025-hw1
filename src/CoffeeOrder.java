// Source code is decompiled from a .class file using FernFlower decompiler.
import java.util.Scanner;

public class CoffeeOrder {
   public CoffeeOrder() {
   }

   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      System.out.println("Выберите кофе:");
      System.out.println("1. Латте - 150 руб.");
      System.out.println("2. Капучино - 130 руб.");
      System.out.println("3. Эспрессо - 100 руб.");
      int coffeeChoice = scanner.nextInt();
      Coffee coffee;
      switch (coffeeChoice) {
         case 1:
            coffee = new Coffee("Латте", 150.0);
            break;
         case 2:
            coffee = new Coffee("Капучино", 130.0);
            break;
         case 3:
            coffee = new Coffee("Эспрессо", 100.0);
            break;
         default:
            System.out.println("Неверный выбор. По умолчанию будет выбран Эспрессо.");
            coffee = new Coffee("Эспрессо", 100.0);
      }

      System.out.println("Выберите уровень сахара:");
      System.out.println("1. Без сахара - 0 руб.");
      System.out.println("2. Мало сахара - 10 руб.");
      System.out.println("3. Много сахара - 15 руб.");
      int sugarChoice = scanner.nextInt();
      Sugar sugar;
      switch (sugarChoice) {
         case 1:
            sugar = new Sugar("Без сахара", 0.0);
            break;
         case 2:
            sugar = new Sugar("Мало сахара", 10.0);
            break;
         case 3:
            sugar = new Sugar("Много сахара", 15.0);
            break;
         default:
            System.out.println("Неверный выбор. По умолчанию будет выбран уровень 'Без сахара'.");
            sugar = new Sugar("Без сахара", 0.0);
      }

      double totalPrice = coffee.calculatePriceWithSugar(sugar);
      System.out.println("\nВаш заказ:");
      System.out.println(coffee.getName() + " - " + coffee.getBasePrice() + " руб.");
      System.out.println(sugar.getSugarDescription() + " - " + sugar.getSugarPrice() + " руб.");
      System.out.println("Итого: " + totalPrice + " руб.");
      scanner.close();
   }
}
