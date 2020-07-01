import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Iterator;
public class Thread2 
{
   public static void main(String[] args) throws IOException, ParseException,    ClassNotFoundException
   {
    ArrayListThred Alt = new  ArrayListThred();
    Alt.start();
    Thread th =new Thread (new Runnable()
    {
    public void run()
    {
            System.out.println("ArrayList Reverse order:"  );
            ArrayList<String> al=new ArrayList<String>();
            al.add("Vishal");
            al.add("Vijay");  
            al.add("Ravi");  
            al.add("Ajay");  

            for(int i=(al.size()-1); i>=0;i--)
            {
                System.out.println(al.get(i));  
            }
    }
    });
    th.start();
    }
}
class ArrayListThred extends Thread
    {
        Thread t;
        int sum = 0;
        static int total;

        
        public void run()
        {
            ArrayList<String> al=new ArrayList<String>();  
            al.add("Vishal");
            al.add("Vijay");  
            al.add("Ravi");  
            al.add("Ajay");  
            Iterator<String> itr=al.iterator();
            while(itr.hasNext()){  
             System.out.println(itr.next());  
            }
        }
    public void start ()
        {
           System.out.println("ArrayList Forward order:"  );
           if (t == null)
           {
              t = new Thread(this);
              t.start ();
   }
   }
}