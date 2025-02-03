public class CustomerDemo{
    public static void main(String[] args) {
        Customer customer = new Customer();

        customer.addBalance(500);  // Calls addBalance(double)
        customer.addBalance(200);     // Calls addBalance(int)
        
        customer.showBalance();       // Display current balance
        
        customer.deductBalance(300);
        
        customer.showBalance();       // Display updated balance
    }
}