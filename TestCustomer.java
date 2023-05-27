public class TestCustomer {

    public static void main(String[] args) {
        
        // Construct new customer using customer constructor
        Customer c1 = new Customer(1, "Bob", 50);

        // Get the customers ID using getID() method
        System.out.println("Customers ID using getID()");
        System.out.println(c1.getID());

        // Get the customers name using getName() method
        System.out.println("");
        System.out.println("Customer's name using getName()");
        System.out.println(c1.getName());

        // Get the customers discount using getDiscount() method
        System.out.println(" ");
        System.out.println("Customers discount using getDiscount();");
        System.out.println("%" + c1.getDiscount());

        // Set the customers discount
        System.out.println(" ");
        c1.setDiscount(100);
        System.out.println("Customer " + c1.getName() + "'s discount has been updated.");

        // Print the customer using the toString() method
        System.out.println(" ");
        System.out.println("Customer toString()");
        System.out.println(c1);
    }
    
}
