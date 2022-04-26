public class Main{
  static int i=0,sum=0,sumr=0;
    public static void limit(int num,int limit)
    {
        for(int i=0;i<=limit;i++)
        {
            if(i%num==0)
            {
                sum+=i;
            }
            
       else
       {
       sumr+=i;    
       }
       
        }
        System.out.println(sum);
        System.out.println(sumr);
        System.out.println(sumr-sum);
    }
    public static void main(String args[])
    {
        int num=6;
        int limit=30;
        limit(num,limit);
    }
}


// public class Main
// {
//     public static void pattern(int n)
//     {
//         for(int i=0;i<n;i++)
//         {
//             for(int j=0;j<n;j++)
//             {
//                 System.out.println("*");
//             }
//             System.out.println("\n");
//         }
//     }
//     public static void main(String args[])
//     {
//         int n=5;
//         pattern(n);
//     }
// }



