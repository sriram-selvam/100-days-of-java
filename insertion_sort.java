public class Main
{
    static int i,key,j;
static void insertion_sort(int arr[],int n)
{
    System.out.println(n);
    for(i=1;i<=4;i++)
    {
        key=arr[i];
        j=i-1;
        while(j>=0 && arr[j]>key)
        {
            arr[j+1]=arr[j];
            j=j-1;
        }
    arr[j+1]=key;
        
    }
    for(i=0;i<n;i++)
    {
        System.out.println(arr[i]);
    }
}
    public static void main(String args[])
    {
        int arr[]={15,3,1,32,4};
        int n=arr.length;
        insertion_sort(arr,n);
        
    }
}
