import java.util.Scanner;
public class Login 
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Username:");
    String s1 = sc.nextLine();
    System.out.println("Enter Password:");
    String s2 = sc.nextLine();

        int n = UserMainCode.display(s1,s2);
        if(n==1)
        {
         System.out.println("Congrats!!! You have Login Successfully");
        }
        else
        {
         System.out.println("Invalid username and password");
        }
  }
}
class UserMainCode {
   
    
    public static int display(String username,String password)
    {
    	
    	
    	if(username.length()>=5 && username.trim().length() > 0)
    	{
    		username.trim();
    	 if(password.length()>=6 && password.length()<=12)
                    {
                                    return 1;
                    }
                     else
                    {
                                    return -1;
                    }
       }
		return 0;
    }
}