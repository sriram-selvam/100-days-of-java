import java.util.Scanner;
public class Main
{
    public static void fibonacciNumber(int n)
    {
        int first=0,result=0;
        int second=1;
        for(int i=0;i<=n;i++)
        {
            result=first+second;
            first=second;
            second=result;
            System.out.println(result);
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        System.out.println(0);
        fibonacciNumber(a);

    }
}