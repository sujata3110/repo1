import java.util.Scanner;
class Test
{
 public static void main(String args[])
{
int arr[]=new int[5];
int i,n=5,el;
Scanner sc=new Scanner(System.in);
el=sc.nextInt();
for(i=0;i<n;i++)
{
arr[i]=sc.nextInt();
}
for(i=0;i<n;i++)
{
if(el==arr[i])
{
System.out.println("Possition="+(i+1));
break;
}
if(i==n)
{
System.out.println("Element is not found");
}
}
}
}