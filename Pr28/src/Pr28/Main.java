package Pr28;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {
    private static Map<Integer, Integer> priceOnProducts = new HashMap<>();
    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private static Order order = new Order();
    private static PayStrategy strategy;

    static {
        priceOnProducts.put(1, 20);
        priceOnProducts.put(2, 25);
        priceOnProducts.put(3, 30);
        priceOnProducts.put(4, 35);
    }

    public static void main(String[] args) throws IOException {
        while (!order.isClosed()) {
            int cost;

            String continueChoice;
            do {
                System.out.print("Пожалуйста, выберите товар:" + "\n" +
                        "1 - Апельсины" + "\n" +
                        "2 - Яблоки" + "\n" +
                        "3 - Груши" + "\n" +
                        "4 - Банан" + "\n");
                int choice = Integer.parseInt(reader.readLine());
                cost = priceOnProducts.get(choice);
                System.out.print("Кол-во: ");
                int count = Integer.parseInt(reader.readLine());
                order.setTotalCost(cost * count);
                System.out.print("Хотите продолжить покупку? Д/Н: ");
                continueChoice = reader.readLine();
            } while (continueChoice.equalsIgnoreCase("Д"));

            if (strategy == null) {
                System.out.println("Пожалуйста, выберите способ оплаты:" + "\n" +
                        "1 - PalPay" + "\n" +
                        "2 - Credit Card");
                String paymentMethod = reader.readLine();

                if (paymentMethod.equals("1")) {
                    strategy = new PayByPayPal();
                } else {
                    strategy = new PayByCreditCard();
                }
            }
            order.processOrder(strategy);

            System.out.print("Оплатить " + order.getTotalCost() + " или Продолжить покупку? О/П: ");
            String proceed = reader.readLine();
            if (proceed.equalsIgnoreCase("О")) {
                if (strategy.pay(order.getTotalCost())) {
                    System.out.println("Оплата прошла успешно.");
                } else {
                    System.out.println("Ошибка! Проверьте свои данные.");
                }
                order.setClosed();
            }
        }
    }
}
