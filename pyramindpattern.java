
import java.util.*;
class Test{
     public static void main(String args[]){
    	int i,j,n;
        Scanner sc=new Scanner (System.in);
    	System.out.println("Enter the number of row");
   	n=sc.nextInt();
for(i = 0; i <n; i++)
{
for(j =n-i ;  j> 1; j --)
{
System.out.print(" ");
}
for(j = 0;  j<= i; j ++)
{
 	System.out.print("* ");
}
System.out.println(" ");
	}

    }
}

