import java.util.Scanner;
abstract class FoodOrder {
    String customerName;
    String itemName;
    int quantity;
    double price;
    FoodOrder(String customerName, String itemName, int quantity, double price) {
        this.customerName = customerName;
        this.itemName = itemName;
        this.quantity = quantity;
        this.price = price;
    }
    abstract void orderFood();
    void generateBill() {
        double total = quantity * price;
        System.out.println("\n===== FINAL BILL =====");
        System.out.println("Customer Name : " + customerName);
        System.out.println("Food Item     : " + itemName);
        System.out.println("Quantity      : " + quantity);
        System.out.println("Price         : Rs." + price);
        System.out.println("Total Amount  : Rs." + total);
        double discount = 0;
        if (total >= 1000) {
            discount = total * 0.10;
            System.out.println("Discount      : Rs." + discount);
        }
        System.out.println("Payable Amount: Rs." + (total - discount));
        System.out.println("======================");
    }
}
class VegOrder extends FoodOrder {
    VegOrder(String customerName, String itemName, int quantity, double price) {
        super(customerName, itemName, quantity, price);
    }
    @Override
    void orderFood() {
        System.out.println("\nVeg Order Placed Successfully");
        System.out.println(itemName + " x " + quantity);
    }
}
class NonVegOrder extends FoodOrder {
    NonVegOrder(String customerName, String itemName, int quantity, double price) {
        super(customerName, itemName, quantity, price);
    }
    @Override
    void orderFood() {
        System.out.println("\nNon-Veg Order Placed Successfully");
        System.out.println(itemName + " x " + quantity);
    }
}
public class swiggy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Customer Name: ");
        String name = sc.nextLine();
        System.out.println("\n1. Veg Pizza - Rs.200");
        System.out.println("2. Veg Burger - Rs.150");
        System.out.println("3. Chicken Biryani - Rs.300");
        System.out.println("4. Chicken Pizza - Rs.350");
        System.out.print("\nSelect Item Number: ");
        int choice = sc.nextInt();
        System.out.print("Enter Quantity: ");
        int qty = sc.nextInt();
        FoodOrder order = null;
        switch (choice) {
            case 1:
                order = new VegOrder(name, "Veg Pizza", qty, 200);
                break;

            case 2:
                order = new VegOrder(name, "Veg Burger", qty, 150);
                break;

            case 3:
                order = new NonVegOrder(name, "Chicken Biryani", qty, 300);
                break;
            case 4:
                order = new NonVegOrder(name, "Chicken Pizza", qty, 350);
                break;
            default:
                System.out.println("Invalid Choice");
                System.exit(0);
        }
        order.orderFood();      
        order.generateBill(); 
        sc.close();
    }
}