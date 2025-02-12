import java.util.Scanner;

class Product{
    String productID;
    String productName;
    String productCategory;
    int quantity;
    private int price;
    public static int totalProducts=0;

    Product() {
        System.out.println("Default Constructor");
        productName="";
        productCategory="";
        quantity=0;
        price=0;
    }

    Product(String productName,String productCategory, int price,int quantity){
        this.productID=productName.substring(0,3).toUpperCase()+Integer.toString(price);
        this.productName=productName;
        this.productCategory=productCategory;
        this.price=price;
        this.quantity=quantity;
        totalProducts++;
    }

    public int getPrice(){
        return this.price;
    }

    public void displayProductInfo(){
        System.out.println("Product ID: "+productID);
        System.out.println("Product Name: "+productName);
        System.out.println("Product Category: "+productCategory);
        System.out.println("Product Price: "+price);
        System.err.println("Stock Value: "+calculateStockValue());
        System.out.println("");
    }

    public static int displayTotalProducts(){
        return totalProducts;
    }

    public int calculateStockValue(){
        return quantity*price;
    }

    public int calculateStockValue(int discount){
        return discount*quantity;
    }
    
}

public class Program5{
    public static void main(String[] args) {

        String name;
        String category;
        int quantity;
        int price;

        Scanner inp=new Scanner(System.in);

        // Product-1
        System.out.print("Enter Product Name: ");
        name=inp.nextLine();

        System.out.print("Enter Product Category: ");
        category=inp.nextLine();

        System.out.print("Enter Product Price: ");
        price=inp.nextInt();
        inp.nextLine();

        System.out.print("Enter Quantity: ");
        quantity=inp.nextInt();
        inp.nextLine();
        
        Product p1=new Product(name,category,price,quantity);

        System.out.println("");

        // Product-2
        System.out.print("Enter Product Name: ");
        name=inp.nextLine();

        System.out.print("Enter Product Category: ");
        category=inp.nextLine();

        System.out.print("Enter Product Price: ");
        price=inp.nextInt();
        inp.nextLine();

        System.out.print("Enter Quantity: ");
        quantity=inp.nextInt();
        inp.nextLine();
        
        Product p2=new Product(name,category,price,quantity);

        System.out.println("");

        // Product-3
        System.out.print("Enter Product Name: ");
        name=inp.nextLine();

        System.out.print("Enter Product Category: ");
        category=inp.nextLine();

        System.out.print("Enter Product Price: ");
        price=inp.nextInt();
        inp.nextLine();

        System.out.print("Enter Quantity: ");
        quantity=inp.nextInt();
        inp.nextLine();
        
        Product p3=new Product(name,category,price,quantity);

        System.out.println("");

        // Display
        System.out.println("Total Number of Products: "+Product.totalProducts);
        System.err.println("");

        System.out.println("Displaying Price:- ");
        System.out.println(p1.productName+": "+p1.getPrice());
        System.out.println(p2.productName+": "+p2.getPrice());
        System.out.println(p3.productName+": "+p3.getPrice());
        System.out.println("");
        
        System.out.println("Displaying Products:- ");
        p1.displayProductInfo();
        p2.displayProductInfo();
        p3.displayProductInfo();

    }
}