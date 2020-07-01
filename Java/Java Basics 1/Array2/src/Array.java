
import java.util.*;
class Array
  {
    public static void main(String[] args) 
    {
       int intArray[]={0,1,2,3,4,5,6,7,8,9};
        Scanner input = new Scanner(System.in);
        System.out.println("Array elements are:");
        for(int i=0; i<intArray.length; i++)
        {
        System.out.print(intArray[i]+" ");
        }
        System.out.println();
        System.out.println("Array from 1-10 except 7:");
       int n = 7;
       for(int i=0; i<intArray.length; i++)
       {
         if(n==i)
          continue;
          System.out.print(i+" ");
         }
      }

}
