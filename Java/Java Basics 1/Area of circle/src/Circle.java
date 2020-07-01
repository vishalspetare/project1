
import java.util.Scanner;

public class Circle 
{

 public static void main(String ag[]) 
 {
  int rad;
  double pie = 3.14, ar;
  Scanner s = new Scanner(System.in);
  System.out.print("Enter radius of circle:");
  rad = s.nextInt();
  ar = pie * rad * rad;
  System.out.println("Area of circle:" + ar);
 }
}