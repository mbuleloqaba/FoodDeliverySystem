public class InvoiceGenerator {
    public static String generateInvoice(Order order) {
        StringBuilder invoice = new StringBuilder();

        invoice.append("========== INVOICE ==========");
        invoice.append("\nOrder Number: ").append(order.getOrderNumber());
        invoice.append("\nRestaurant: ").append(order.getRestaurant().getName());
        invoice.append("\nCustomer: ").append(order.getCustomer().getName());
        invoice.append("\n\n--- Order Items ---\n");

        double totalAmount = 0.0;
        for (OrderItem item : order.getOrderItems()) {
            double itemAmount = item.getMenuItem().getPrice() * item.getQuantity();
            totalAmount += itemAmount;

            invoice.append("Item: ").append(item.getMenuItem().getName());
            invoice.append("\nQuantity: ").append(item.getQuantity());
            invoice.append("\nAmount: $").append(itemAmount);
            invoice.append("\n\n");
        }

        invoice.append("---");
        invoice.append("\nTotal Amount: $").append(totalAmount);
        invoice.append("\n===========================");

        return invoice.toString();
    }
}
