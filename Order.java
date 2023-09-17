import java.util.ArrayList;
import java.util.List;

public class Order {
    private int orderNumber;
    private Restaurant restaurant;
    private Customer customer;
    private List<OrderItem> orderItems;

    public Order(int orderNumber, Restaurant restaurant, Customer customer) {
        this.orderNumber = orderNumber;
        this.restaurant = restaurant;
        this.customer = customer;
        this.orderItems = new ArrayList<>();
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public Restaurant getRestaurant() {
        return restaurant;
    }

    public Customer getCustomer() {
        return customer;
    }

    public List<OrderItem> getOrderItems() {
        return orderItems;
    }

    public void addItem(OrderItem orderItem) {
        orderItems.add(orderItem);
    }
}
