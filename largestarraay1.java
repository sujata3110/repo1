class Test{
public static void main(String args[]){
 int arr[]={4,5,6,7,8};
int n=arr.length;
int max=arr[0];
for(int i=1;i<n;i++){
if(arr[i]>max)
max=arr[i];
}
System.out.println("The largest element of array is:"+max);
}
}