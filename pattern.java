import java.util.Scanner;
 class Test{
public static void main(String args[]){
 int n,i,j;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number of row");
n=sc.nextInt();
for(i=0;i<n;i++)
{
for(j=n-1;j>0;j--)
{
System.out.print(" ");
}
for(j=0;j<2*i+1;j++)
{
System.out.print("*");
}
System.out.println("");
}
}
}