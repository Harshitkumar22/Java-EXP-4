import java.util.Scanner;

class Book{
    String title;
    String author;
    int year;

    Book(){
        title="Untitled";
        author="Unknown Author";
    }

    public Book(String paraTitle,String paraAuthor){
        title=paraTitle;
        author=paraAuthor;
    }

    public Book(String paraTitle,String paraAuthor,int paraYear){
        title=paraTitle;
        author=paraAuthor;
        year=paraYear;
    }

}

public class Book1{

    public static void main(String[] args){
        
        String title,author;
        int year;
        Scanner inp= new Scanner(System.in);

        Book obj1 = new Book();
        System.out.println("Default Constructor:- ");    
        System.err.println("\t"+"Title: "+obj1.title);
        System.err.println("\t"+"Author: "+obj1.author+"\n");

        // Parameterized Constructor
        System.out.print("Enter Book title: ");
        title=inp.nextLine();
        System.out.print("Enter Book Author: ");
        author=inp.nextLine();
        
        Book obj2 = new Book(title,author);
        System.out.println("Parameterized Constructor:- ");    
        System.err.println("\t"+"Title: "+obj2.title);
        System.err.println("\t"+"Author: "+obj2.author+"\n");

        
        // Parameterized Constructor with three parameter
        System.out.print("Enter Book title: ");
        title=inp.nextLine();
        System.out.print("Enter Book Author: ");
        author=inp.nextLine();
        System.out.print("Enter Publication Year: ");
        year=inp.nextInt();
        
        Book obj3 = new Book(title,author,year);
        System.out.println("Parameterized Constructor:- ");    
        System.err.println("\t"+"Title: "+obj3.title);
        System.err.println("\t"+"Author: "+obj3.author);
        System.err.println("\t"+"Year: "+obj3.year+"\n");

    }
}