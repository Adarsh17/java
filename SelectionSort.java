class SelectionSort
{
public static void main(String args[])
{
int arr[]={88,33,57,61,48,109,94};
for(int i=arr.length-1;i>0;i--)
{
  int largest=0;
  for(int j=1;j<=i;j++)
  {
    if(arr[j]>arr[largest])
     {
       largest=j;
     }
  }
    swap(arr,largest,i);
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


int temp=arr[i];
arr[i]=arr[j];
arr[j]=temp;
}
}