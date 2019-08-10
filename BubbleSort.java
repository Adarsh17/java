


class BubbleSort
{
public static void main(String args[])
{
int arr[]={9,3,7,11,8};
for(int i=arr.length-1;i>0;i--)
{
for(int j=0;j<i;j++)
{
if(arr[j]>arr[j+1])
{
swap(arr,j,j+1);
}
}
}
for(int j=0;j<arr.length;j++)
{
System.out.println(arr[j]);
}
}

public static void swap(int arr[],int i,int j)
{
if(i==j)
{
return;
}
int t=arr[i];
arr[i]=arr[j];
arr[j]=t;
}
}