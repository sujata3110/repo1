import java.util.*;
	 class Test{
  public static void main(String args[]){
		int i,j,n;
Scanner sc=new Scanner (System.in);
System.out.println("Enter the number of rows");
n=sc.nextInt();
		for(i=n;i>=1;i--)
	{
		for(j=1;j<=i ;j++)
   	{
        System.out.print(i+" ");
       }
  System.out.println(" ");
     }
   }
}
