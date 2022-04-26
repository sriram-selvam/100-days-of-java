public class Main
{
    public static void duplicateElements(int arr[])
    {
        int i,j;
        int n=arr.length; 

        for(i=0;i<n;i++)
        {
            for(j=i+1;j<n;j++)
            {
                if(arr[i]==arr[j])
                {                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              
                    System.out.println(arr[i]);
                }
            }
         }
    }
    public static void main(String args[])
    {
        int arr[]={10,4,54,44,4,9};
        duplicateElements(arr);

    }
}