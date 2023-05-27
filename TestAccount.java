public class TestAccount {
    
    public static void main(String[] args) {
        
        Customer JNezzy = new Customer(3, "JNezzy", 100);
        Account acc1 = new Account(0, JNezzy);


        Customer Jon = new Customer(4, "Jon", 99);
        Account acc2 = new Account(1, Jon, 6000);

        System.out.println("Get Account ID using getID() ");
        System.out.println("Account 1: " + acc1.getId());
        System.out.println("Account 2: " + acc2.getId());

        System.out.println(" ");
        System.out.println("Get Account Customer using getCustomer()");
        System.out.println("Account 1: " + acc1.getCustomer());
        System.out.println("Account 2: " + acc2.getCustomer());

        System.out.println(" ");
        System.out.println("Get Account Balance using getBalance()");
        System.out.println("Account 1: " + acc1.getBalance());
        System.out.println("Account 2: " + acc2.getBalance());

        System.out.println(" ");
        acc1.setBalance(420);
        acc2.setBalance(619);
        System.out.println("Account balances have been updated using setBalance()");
        System.out.println("Account 1: " + acc1.getBalance());
        System.out.println("Account 2: " + acc2.getBalance());

        System.out.println(" ");
        System.out.println("Accounts using toString()");
        System.out.println("Account 1: " + acc1);
        System.out.println("Account 2: " + acc2);

        System.out.println(" ");
        System.out.println("Get Account Customer Name using getCustomerName()");
        System.out.println("Account 1: " + acc1.getCustomerName());
        System.out.println("Account 2: " + acc2.getCustomerName());


        System.out.println(" ");
        System.out.println("Deposit using deposit()");
        acc1.deposit(50);
        System.out.println("Account 1 has been deposited $50");
        acc2.deposit(125);
        System.out.println("Account 2 has been deposited $125");
        System.out.println("Account 1 New Balance: $" + acc1.getBalance());
        System.out.println("Account 2 New Balance: $" + acc2.getBalance());

        System.out.println(" ");
        System.out.println("Successfully withdraw $50 from Account 1");
        acc1.withdraw(50);
        System.out.println("Account 1 balance: $" + acc1.getBalance());
        System.out.println("Unsucessfully withdraw $1000 from Account 2");
        acc2.withdraw(1000);
        System.out.println("Account 2 balance: " + acc2.getBalance());
        System.out.println(" ");







        
        
    }   
    
}
