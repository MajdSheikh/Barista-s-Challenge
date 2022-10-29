import java.util.ArrayList;

public class TestOrders {

    public static void main(String[] args) {

        //Create 2 orders for unspecified guests (without specifying a name)
        Order order1 = new Order();
        Order order2 = new Order();

        // Create 3 orders using the overloaded constructor to give each a name for the order.
        Order order3 = new Order("Jimmey");
        Order order4 = new Order("Sam");
        Order order5 = new Order("Noah");


        // Add at least 2 items to each of the orders using the addItem method
        order1.addItem(new Item("latte", 4.5));
        order2.addItem(new Item("drip coffee", 6.5));

        //test the results and the display method
        order3.display();
        order1.display();

        // Test your getStatusMessage functionality
        order1.setReady(true);
        order2.setReady(true);
        order3.setReady(true);

        System.out.println(order2.getStatusMessage());


    }
}