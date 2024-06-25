class Test{
public static void main(String args[]){
 int arr[]={4,-5,6,7,-8};
int n=arr.length;
int start=0;
int end=n-1;
int temp;
while(start<end)
{
	if(arr[start]>0&arr[end]<0)
  {
	temp=arr[end];
	arr[end]=arr[start];
	arr[start]=temp;
	start++;
	end--;
   }
if(arr[start]>0&arr[end]>0)
  {
end--;
   }
if(arr[start]<0&arr[end]>0)
  {
start++;
end--;
}
if(arr[start]<0&arr[end]<0)
  {
start++;
}
}
for(int i=0;i<n;i++){
System.out.println(arr[i]+" ");
      }
    }
  }