import java.util.*;
class Test{
      public static void main(String args[])
{
 		int i=1,n;
		int fact=1;
 	        Scanner sc=new Scanner(System.in);
                System.out.println("Enter the number");
		n=sc.nextInt();
  do
{
   fact=fact*i;
 i++;
}
while(i<=n);
System.out.println("Factorial of "  +n+  " is "  +fact);
    }
}               
