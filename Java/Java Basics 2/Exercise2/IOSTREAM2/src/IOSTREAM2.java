import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
 
public class IOSTREAM2
{
    public static void main(String[] args) throws IOException
    {	
    	FileInputStream instream = null;
	FileOutputStream outstream = null;
 
    	try{
    	    File infile =new File("C:\\Users\\VISHAL\\eclipse-workspace\\IOSTREAM2\\content1\\content1.txt");
    	    File outfile =new File("C:\\Users\\VISHAL\\eclipse-workspace\\IOSTREAM2\\content2\\content2.txt");
 
    	    instream = new FileInputStream(infile);
    	    outstream = new FileOutputStream(outfile);
 
    	    byte[] buffer = new byte[1024];
 
    	    int length;
    	    
    	    while ((length = instream.read(buffer)) > 0)
    	    {
    	    	outstream.write(buffer, 0, length);
    	    }

    	    instream.close();
    	    outstream.close();

    	    System.out.println("File copied successfully!!");
 
    	}
    	catch(IOException ioe)
    	{
    		ioe.printStackTrace();
    	 }
    	
    	 File file = new File("C:\\\\Users\\\\VISHAL\\\\eclipse-workspace\\\\IOSTREAM2\\\\content1\\\\content1.txt"); 
         FileInputStream fileStream = new FileInputStream(file); 
         InputStreamReader input = new InputStreamReader(fileStream); 
         BufferedReader reader = new BufferedReader(input); 
           
         String line; 
           
         // Initializing counters 
         int countWord = 0; 
         int sentenceCount = 0; 
         int characterCount = 0; 
        
        
         while((line = reader.readLine()) != null) 
         { 
             if(line.equals("")) 
             { 
                 
             } else { 
                 characterCount += line.length(); 
                   
                 // \\s+ is the space delimiter in java 
                 String[] wordList = line.split("\\s+"); 
                   
                 countWord += wordList.length; 
                  
                   
       
                 String[] sentenceList = line.split("[!?.:]+"); 
                   
                 sentenceCount += sentenceList.length; 
             } 
         } 
         System.out.println("Total number of characters = " + characterCount);  
         System.out.println("Total words count = " + countWord); 
         System.out.println("Total number of lines = " + sentenceCount); 
         	
    	
    }
}