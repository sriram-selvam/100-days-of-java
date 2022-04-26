import java.util.Scanner;
public class Main{
 
  public static  void add(int a,int b)
  {
      int sum=0;
      sum=a+b;
      System.out.println(sum);
   
  }
    public static void main(String args[])
    {
         int a,b,c;
         Scanner sc= new Scanner(System.in);
         System.out.println("Enter A value");
         a=sc.nextInt();
         System.out.println("Enter B value");
         b=sc.nextInt();
         sc.close();
         add(a,b);
        
    }
}