
public class Thread4
{
 public static void main(String [] args)
 {
	ThreadA t1=new ThreadA();
	t1.start();
	
	
	Runnable r2 = new Runnable2();
    Thread t2 = new Thread(r2);
    t2.start();
	
	
}
}
class ThreadA extends Thread
{
	public void run()
	{
		System.out.print("Thread 1:");
	for(int i=1; i<=10;i++)
	{
		
		System.out.print(" "+i);
	}
	System.out.println();
	System.out.println();
}
}
class Runnable2 implements Runnable
{
	
	public void run()
	{
		System.out.print("Thread 2:");
	for(int i=10; i>=1;i--)
	{
		

		System.out.print(" "+i);
	}
}

}