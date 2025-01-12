package foodordering;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Restaurant restaurant = new Restaurant();

        // Add menu items
        FoodItem pizza = new FoodItem("Pizza", 12.99F, "Cheese pizza", Arrays.asList("Cheese", "Tomato Sauce", "Dough"));
        DrinkItem soda = new DrinkItem("Soda", 2.99F, "Refreshing beverage", "Medium");

        restaurant.addToMenu(pizza);
        restaurant.addToMenu(soda);

        // View menu
        System.out.println("Menu:");
        for (MenuItem item : restaurant.viewMenu()) {
            System.out.println(item.getDetails() + "\n");
        }

        // Create an order
        Order order = new Order();
        order.addItem(pizza);
        order.addItem(soda);

        // Calculate total
        System.out.println("Order Total: $" + order.calculateTotal());

        // Process order
        restaurant.processOrder(order);

        // Create a user and place an order
        User user = new User(1, "John Doe");
        user.placeOrder(order);

        // View order history
       user.viewOrderHistory();
        }
    }
