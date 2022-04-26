public class Main
{
   static int i=0,j=1,temp=0;
    public static void bubble_sort(int arr[],int len)
    {
     for(int i=0;i<len;i++)
     {
         for(int j=1;j<len-i;j++)
         {
             if(arr[j-1]>arr[j])
             {
                 temp= arr[j-1];
                 arr[j-1]=arr[j];                                                                                           
                 arr[j]= temp;
            }
         }
     }
     for(i=0;i<len;i++)
    {
        System.out.println(arr[i]);
    }
        
    }
    public static void main(String args[])
    {
        int arr[]={3,10,32,4,34,2};
        int len=arr.length;
        bubble_sort(arr,len);   
    }
}