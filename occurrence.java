import java.util.Scanner;
class Test{
public static void main(String args[]){
 int arr[]={4,5,4,7,8,4,5,6,4,4,4};
int n=arr.length;
int k=0;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the element");
int el= sc.nextInt();
for(int i=0;i<n;i++)
{
     if(arr[i]==el)
   k++;
}
System.out.println("Occurrence="+k);
}
}

