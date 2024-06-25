import java.util.*;
	 class Test{
  public static void main(String args[]){
		int i,j,n;
Scanner sc=new Scanner (System.in);
System.out.println("Enter the number of rows");
n=sc.nextInt();
		for(i=1;i<=n;i++)
	{
		for(j=n;j>=i ;j--)
   	{
        System.out.print(j+"");
       }
  System.out.println("");
     }
   }
}
