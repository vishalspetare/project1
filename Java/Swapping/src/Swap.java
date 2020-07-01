import java.util.Scanner;
 class Swap
 {
	 
	 public static void main(String[] args)
	 {
	     
	   int a, b, temp;
	   Scanner scan=new Scanner(System.in);
	   System.out.print("Enter the First Number:");
	    a=scan.nextInt();
	   System.out.print("Enter the Second Number:");
	    b=scan.nextInt();
	   
	   temp = a;
	    
	   a = b;
	   b = temp;   
	  System.out.println("Numbers After swapping:"+a+","+ b);
	 }
	 }
