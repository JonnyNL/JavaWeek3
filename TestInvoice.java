public class TestInvoice {

    public static void main(String[] args) {
        
        Customer testDummy = new Customer(2, "Dummy", 10);

        Invoice i1 = new Invoice(1, testDummy, 25);


        System.out.println("Invoice ID using getID()");
        System.out.println("Invoice ID: " + i1.getID());

        // Get the customer
        System.out.println(" ");
        System.out.println("Get the Invoice Customer using getCustomer()");
        System.out.println(i1.getCustomer());

        
        // Set the customer
        Customer tester = new Customer(3, "Tester", 5);
        i1.setCustomer(tester);
        System.out.println(" ");
        System.out.println("Invoice 1 Customer has been updated");
        System.out.println("Invoice Customer:" + i1.getCustomer());

        // Get the invoice amount
        System.out.println(" ");
        System.out.println("Get the Invoice amount using getAmount() method");
        System.out.println("Invoice Amount: $" + i1.getAmount());

        // Set the invoice amont
        System.out.println(" ");
        i1.setAmount(2500);
        System.out.println("Invoice 1 amount has been updated");
        System.out.println("Invoice amount: $" + i1.getAmount());


        // Get the customers name
        System.out.println(" ");
        System.out.println("Get Customers name using getCustomerName()");
        System.out.println("Invoice Customer Name: " + i1.getCustomerName());

        // Invoice amount after customer discount
        System.out.println(" ");
        System.out.println("Customer Invoice amount after Customer Discount using getAmountAfterDiscount()");
        System.out.println("Invoice Amount: $" + i1.getAmountAfterDiscount());

    }
    
}
