import java.util.*;
 class Sample{
public static void main(String args[]){
 int n,i,j,k;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number of row");
n=sc.nextInt();
k=1;
for(i=0;i<n;i++)
{
       for(j=n-1;j>0;j--)
{
      System.out.print(" ");
}
for(j=0;j<2*i+1;j++)
{
System.out.print(k);
k++;
}
System.out.println("");
}
}
}