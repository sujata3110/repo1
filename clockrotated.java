class Test{
public static void main(String args[]){
 int arr[]={4,5,6,7,8};
int n=arr.length;
int temp=arr[n-1];
for(int i=n-1;i>0;i--)
{
arr[i]=arr[i-1];
}
arr[0]=temp;
for(int i=0;i<n;i++){
System.out.println(arr[i]);
      }
    }
  }