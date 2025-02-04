//4. Define a Car class with attributes make, model, and year.
//Create a parameterized constructor that uses the this keyword to distinguish constructor parameters from the class fields (e.g., this.make = make;). 
//Instantiate a Car object with specific values (e.g., "Tesla", "Model 3", 2025) and display its details, ensuring the correct assignment of attributes using this.


class Car{
    private String make;
    private String model;
    private int year;
    
    public Car(String make, String model, int year){  // Parameterized constructor using 'this' to distinguish instance variables
        this.make=make;
        this.model=model;
        this.year=year;
    }

    public void displayCarDetails(){      // Method to display car details
        System.out.println("Car Details:");
        System.out.println("Make: " + this.make);
        System.out.println("Model: " + this.model);
        System.out.println("Year: " + this.year);
    }

    public static void main(String[] args){       // Creating an instance of Car with specific values
        Car myCar=new Car("TATA NEXON", "Model 1", 2024);

        myCar.displayCarDetails();      // Displaying car details
    }
}
