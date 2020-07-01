import java.util.ArrayList;
import java.io.*;

public class Employee
{
int code;
String name;
String position;
double salary;
static ArrayList al = new ArrayList();
static int count = 0; //to track the no. of employees

Employee()
{
}

//constructor for initializing employee objects

Employee(int code, String name, String position,double salary)
{
this.code = code;
this.name = name;
this.position = position;
this.salary = salary;
count++;
}

//method to store employees details in an arraylist

public void putDetails(Employee e)
{
al.add(e);
}

//method to retreive employee objects

public Employee getDetails(int id)
{
Employee es = (Employee)al.get(id);
return es;
}


public static void main(String[] args) throws IOException
{

BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

Employee e = new Employee();
Employee e1 = new Employee(1, "Vishal", "Java Developer",350000);
Employee e2 = new Employee(2, "Shubham", "Software Tester",250000);
Employee e3 = new Employee(3, "Abhishek", "Full Stack Developer",600000);
Employee e4 = new Employee(4, "Sagar", "HTML Developer",250000);
Employee e5 = new Employee(5, "Rahul", "SQL Developer",300000);
Employee e6 = new Employee(6, "Hritik", "HR",700000);


e.putDetails(e1);
e.putDetails(e2);
e.putDetails(e3);
e.putDetails(e4);
e.putDetails(e5);
e.putDetails(e6);

System.out.println("The total number of employees are: " +count);
System.out.println(" ");

while(true)
{
System.out.println("Enter employee id to get the employee details: ");
int code = Integer.parseInt(br.readLine());
boolean flag = false;

for(int i=0; i<=code;i++)
{
Employee es = e1.getDetails(i);
if(code == es.code)
{
System.out.println("The details of the employee with id " +code+" is: ");
System.out.print(es.code +" " +es.name+" " +es.position+" "+es.salary);
flag = true;
break;
}
}

System.out.println(" ");

if(!flag)
{
System.out.println("Sorry, no data exists with the id " +code);
}
System.out.println(" ");
String ch = null;

while(true)
{
System.out.println("Want to Continue(y/n)?)");
System.out.println(" ");
ch = br.readLine();
if(ch.equalsIgnoreCase("y") || ch.equalsIgnoreCase("n")) break;
if(!(ch.equalsIgnoreCase("y") || ch.equalsIgnoreCase("n")))
{
System.out.println("Invalid option : please type y/n");
System.out.println(" ");
}
}

if(ch.equalsIgnoreCase("n"))
{
System.out.println(" ");
System.out.println("Thank you");
break;
}
}
}
}
