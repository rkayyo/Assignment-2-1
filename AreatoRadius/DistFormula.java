import java.util.Scanner;

class DistFormula {
    
 public static void Main (String[] args){
     Scanner s = new Scanner(System.in);
     
     System.out.println("Please enter the first x,y coordinate");
     System.out.println("\n");
     System.out.println("x");
     int x1 = s.nextInt();
     System.out.println("y");
     int y1 = s.nextInt();
     
     System.out.println("Please enter the second x,y coordinate");
     System.out.println("\n");
     System.out.println("x");
     int x2 = s.nextInt();
     System.out.println("y");
     int y2 = s.nextInt();
     
     double distance = ((x2 - x1)*(x2 - x1) + (y2 - y1)*(y2 - y1));
     
     System.out.println("The distance between these 2 points is " + distance + " units");
     
     
     
     
     
    }
    
    
}