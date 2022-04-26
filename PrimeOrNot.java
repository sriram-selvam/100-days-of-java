import java.util.Scanner;
public class Main
{
    
    static int count;
public static void primeOrNot(int num)
{
    for(int i=2;i<num;i++)
    {
        if(num%i==0)
        {
            count++;
        }
    }
    if(count>0)
    {
        System.out.println("Given is not Prime");
    }
    else{
        System.out.println("Given is prime");
    }
    
}
    public static void main(String args[])
    {
        int num;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number to find it is prime or not");
        num =sc.nextInt();
        System.out.println(num);
    primeOrNot(num);
    }
}