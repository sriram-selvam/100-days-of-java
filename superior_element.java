public class Main
{
    static int i=0,j=0;
  public static void leaders(int arr[],int n)
    {
        for(int i=0;i<n;i++)
        {
            for(j=i+1;j<n;j++)
            {
                if(arr[i]<=arr[j])
                break;
            }
            if(j==n)
    System.out.print(arr[i]); 
        }
    }
    public static void main(String args[])
    {
        int arr[]={8,5,3,9,4,2};
        int n= arr.length;
        int aw[]={6,5,2,1,32,7};
        System.out.println(n);
        leaders(arr,n);
        // leaders(aw,n);
    }
}

