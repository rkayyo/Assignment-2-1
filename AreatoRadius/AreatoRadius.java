import java.util.Scanner;

class AreatoRadius {
    
 public static void Main (String[] args){
     Scanner s = new Scanner(System.in);
     
     System.out.println("Please enter an area for your circle");
     System.out.println("\n");
     double area = s.nextDouble();
     
     double radius = Math.sqrt((area/Math.PI));
     System.out.println("The radius of a circle with area " + area + " has a radius of " + radius + " units.");
     
    }
    
    
}