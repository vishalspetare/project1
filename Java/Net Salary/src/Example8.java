import java.util.Scanner;
public class Example8 
{
public static void main(String[] args) 
{ 

	double hra = 0, ca = 0;

	double net_salary;
	
	try (Scanner scan = new Scanner(System.in)) {
		System.out.println("Enter Basic Salary ($): ");
		 double basic1=scan.nextDouble();
		
		
		
		hra = (basic1*10)/100;

		double pf = (basic1*12)/100;
		
		ca = (basic1*5)/100;
		
		double pt = (basic1*2)/100;
		
net_salary = basic1 + hra + ca - (pf+pt);
	}
	System.out.println("your net salary is:"+net_salary);

	
	
}
}

