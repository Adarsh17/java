import java.util.*;
public class QuickSort
{
    public static int partition(int arr[],int start,int end)
    {
        int pivot=arr[start];
        int i=start,j=end;
        
        while(i<j)
        {
            while(i<j && arr[--j]>=pivot);
            if(i<j)
            {
                arr[i]=arr[j];
            }
            
            while(i<j && arr[++i]<=pivot);
            if(i<j)
            {
                arr[j]=arr[i];
            }
        }
        arr[j]=pivot;
        return j;
    }
    public static void sort(int arr[],int start,int end)
    {
        if(end-start<2)
        {
            return;
        }
        
        int pivotIndex=partition(arr,start,end);
        sort(arr,start,pivotIndex);
        sort(arr,pivotIndex+1,end);
    }
    public static void main(String args[])
    {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=scanner.nextInt();
        }
        
        sort(arr,0,arr.length);
        
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
