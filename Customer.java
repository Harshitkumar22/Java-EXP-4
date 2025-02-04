//1. Declare a Customer class with a private variable balance.
//Implement a public addBalance(double amount) method to add funds.
//Implement a protected deductBalance(double amount) method to reduce funds.
//Define a default-access (package-private) method showBalance() to display the current balance.
//Overload the addBalance(...) method to also accept an int amount for smaller deposits.
//Objective: Create an instance of the Customer class Showcase method overloading for different deposit parameters.


class Customer{
    private double balance;
    
    public void addBalance(double amount){     // Public method to add balance (double)
        if(amount>0){
            balance+=amount;
            System.out.println("Added rs" + amount + " to balance.");
        }else{
            System.out.println("Invalid deposit amount.");
        }
    }

    
    public void addBalance(int amount){       // Overloaded method to add balance (int)
        if (amount>0){
            balance+=amount;
            System.out.println("Added rs: " + amount + " to balance.");
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    
    protected void deductBalance(double amount){  // Protected method to deduct balance
        if(amount>0 && amount<=balance) {
            balance-=amount;
            System.out.println("Deducted rs: " + amount + " from balance.");
        }else{
            System.out.println("Insufficient funds or invalid amount.");
        }
    }

    // Default-access method to show balance
    void showBalance() {
        System.out.println("Current balance: rs" + balance);
    }
}
