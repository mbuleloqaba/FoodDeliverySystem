import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FoodDeliverySystem {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the customer details
        System.out.println("Enter the customer details:");

        // Read the customer name
        System.out.print("Customer name: ");
        String customerName = scanner.nextLine();

        // Read the customer city
        System.out.print("Customer city: ");
        String customerCity = scanner.nextLine();

        // Prompt the user to enter the restaurant details
        System.out.println("\nEnter the restaurant details:");

        // Read the restaurant name
        System.out.print("Restaurant name: ");
        String restaurantName = scanner.nextLine();

        // Read the restaurant city
        System.out.print("Restaurant city: ");
        String restaurantCity = scanner.nextLine();

        // Prompt the user to enter the meal details
        System.out.println("\nEnter the meal details:");

        // Read the meal name
        System.out.print("Meal name: ");
        String mealName = scanner.nextLine();

        // Read the meal price
        double mealPrice = 0.0;
        boolean validPrice = false;
        while (!validPrice) {
            System.out.print("Meal price: ");
            String priceInput = scanner.nextLine();
            try {
                mealPrice = Double.parseDouble(priceInput);
                validPrice = true;
            } catch (NumberFormatException e) {
                System.out.println("Invalid price! Please enter a valid number.");
            }
        }

        // Read the meal quantity
        int mealQuantity = 0;
        boolean validQuantity = false;
        while (!validQuantity) {
            System.out.print("Meal quantity: ");
            String quantityInput = scanner.nextLine();
            try {
                mealQuantity = Integer.parseInt(quantityInput);
                validQuantity = true;
            } catch (NumberFormatException e) {
                System.out.println("Invalid quantity! Please enter a valid number.");
            }
        }

        // Calculate the total amount
        double totalAmount = mealPrice * mealQuantity;

        // Generate the invoice
        String invoiceContent = "INVOICE\n\n" +
                "Customer Name: " + customerName + "\n" +
                "Customer City: " + customerCity + "\n" +
                "Restaurant Name: " + restaurantName + "\n" +
                "Restaurant City: " + restaurantCity + "\n\n" +
                "Meal Details:\n" +
                "Name: " + mealName + "\n" +
                "Price: " + mealPrice + "\n" +
                "Quantity: " + mealQuantity + "\n" +
                "Total Amount: " + totalAmount;

        // Write the invoice to a file
        try {
            FileWriter writer = new FileWriter("invoice.txt");
            writer.write(invoiceContent);
            writer.close();
            System.out.println("\nInvoice generated successfully!");
        } catch (IOException e) {
            System.out.println("\nAn error occurred while generating the invoice.");
            e.printStackTrace();
        }

        // Close the scanner
        scanner.close();
    }
}

// Used definitions from Hyperion Dev Full Stack Software and Web Developer pdf resourse "Capstone Project I —Object-Oriented Programming"//