import java.util.Scanner;
public class Main{
 public static void main (String[] args) {
  
    Scanner sc= new Scanner(System.in);
        System.out.println("enter the number of elements");
        int n= sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            System.out.println("Entered Elements are"+ arr[i]);
        }
     
 }   
}