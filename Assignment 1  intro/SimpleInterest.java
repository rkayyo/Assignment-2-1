import java.util.Scanner;

class SimpleInterest{
    
 public static void Main (String[] args){
     Scanner s = new Scanner(System.in);
     
     double p = 0;
     double r = 0;
     double i = 0;
     double n = 0;
     
     
     System.out.println("Simple Interest Calculator");
     System.out.println("\n");
     System.out.print("Enter the principal value");
     p = s.nextDouble();
     System.out.print("Enter the interest rate (between 0-1)");
     r = s.nextDouble();
     System.out.print("Enter the number of years you will be investing your money for");
     n = s.nextDouble();
     
     i = p * Math.pow(1+r,n);
     System.out.println("Your investment will be worth $" + i + " after " + n + " years.");
     
     
    }
    
}