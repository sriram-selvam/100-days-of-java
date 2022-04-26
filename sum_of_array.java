import java.io.*;
import java.lang.Math;
public class Main
{
   static int i=0,sum=0,res=0,mins=0;
   public static void sumofarray(int arr[],int length)
    {
        int res=arr[0];
        for(i=0;i<length;i++)
        {
           res= Math.max(res,arr[i]);
            
            sum=sum+arr[i];
        }
        System.out.println(sum);
        System.out.println(res);
          
    }
    public static int min(int arr[],int length)
    {
       int mins=arr[0];  
        for(i=1;i<length;i++)
        {    
           mins= Math.min(mins,arr[i]);
        }
        return mins;
    }
    public static void main(String args[])
    {
        int arr[]={2,4,5,62,21,1};
        int len=arr.length;
        sumofarray(arr,len);
       System.out.println(min(arr,len)); 
    }
}
//finding max and min element from an array..