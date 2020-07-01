import java.io.File; 
  
public class IO1  
{ 
     static void RecursivePrint(File[] arr,int index,int level)  
     {  
         if(index == arr.length) 
             return; 
            
         for (int i = 0; i < level; i++) 
             System.out.print("\t"); 
           
         
         if(arr[index].isFile()) 
             System.out.println(arr[index].getName()); 
           
         else if(arr[index].isDirectory()) 
         { 
             System.out.println("[" + arr[index].getName() + "]"); 
               
           
             RecursivePrint(arr[index].listFiles(), 0, level + 1); 
         } 
            
         RecursivePrint(arr,++index, level); 
    } 
      
 
    public static void main(String[] args) 
    { 
          
        String maindirpath = "C:\\Users\\VISHAL\\eclipse-workspace\\IOSTREAM1"; 
                  
       
        File maindir = new File(maindirpath);
        File f1=new File("C:\\Users\\VISHAL\\eclipse-workspace\\IOSTREAM1\\Batch");
        File f2=new File("C:\\Users\\VISHAL\\eclipse-workspace\\IOSTREAM1\\Batch\\batchmates.txt");
         System.out.println("File and Folder Created Successfully...");
           
        if(maindir.exists() && maindir.isDirectory()) 
        { 
           
            File arr[] = maindir.listFiles(); 
              
            System.out.println("**********************************************"); 
            System.out.println("Files from main directory : " + maindir); 
            System.out.println("**********************************************"); 
              
             
            RecursivePrint(arr,0,0);  
       }  
    } 
} 