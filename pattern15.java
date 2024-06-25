import java.util.*;
	 class Test{
  public static void main(String args[]){
		int i,j,n;
Scanner sc=new Scanner (System.in);
System.out.println("Enter the number of rows");
n=sc.nextInt();
		for(i=0;i<=n;i++)
	{
		for(j=0;j<=i;j++)
   	{
  if (i == 0 || j == 0 || i == n - 1 || j == n - 1) 
{
        System.out.print("*");
       }
}
  System.out.println("");
     }
   }
}
