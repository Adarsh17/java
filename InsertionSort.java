class InsertionSort
{
public static void main(String args[])
{
int arr[]={33,25,47,58,12};
for(int i=1;i<arr.length;i++)
{
int n=arr[i];
int j;
for(j=i;j>0 && arr[j-1]>n;j--)
{
arr[j]=arr[j-1];
}
arr[j]=n;
}

for(int j=0;j<arr.length;j++)
{
System.out.println(arr[j]);
}

}
}