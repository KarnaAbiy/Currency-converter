import java.util.*;

public class main
{
   public static void main(String[] args)
   {
     int choice;
     double amount;
     double dollar, yuan, euro;
     
     Scanner sc = new Scanner(System.in);
     
     System.out.println("Options:");
     System.out.println("Enter 1: Dollar");
     System.out.println("Enter 2: Yuan");
     System.out.println("Enter 3: Euro")
     
     System.out.println("\nChoose your option: ");
     choice = sc.nextInt();
     System.out.println("Your number is: " + choice);

     System.out.println("Enter the amount you want to convert?");
     amount = sc.nextFloat();
     System.out.println("Your amount is: " + amount);

     switch (choice)
       {
         case 1:
            yuan = amount * 7.12;
            System.out.println(amount + " Dollar = " + yuan + " Yuan");
            euro = amount * 1.02;
            System.out.println(amount + " Dollar = " + euro + " Euro");
           break;

        case 2:
           dollar = amount * 0.14;
            System.out.println(amount + " Yuan = " + dollar + " Dollar");
            euro = amount * 0.14;
            System.out.println(amount + " Yuan = " + euro + " Euro");
           break;

        case 3:
           dollar = amount * 0.98;
            System.out.println(amount + " Euro = " + dollar + " Dollar");
            yuan = amount * 6.98;
            System.out.println(amount + " Euro = " + yuan + " Yuan");
           break;
           
         default:
           System.out.println("Invalid input");
        }
   }
}
