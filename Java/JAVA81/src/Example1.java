class Example1
{  
    public static void main(String[] args)
    {  
      
        
        //Thread Example with lambda  
        Runnable r1=()->{  
                System.out.println("Thread1 is running...");}; 
        Thread t1=new Thread(r1);  
        t1.start(); 
    }  
}  
