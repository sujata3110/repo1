import java.util.*;
class Test{
   public static void main(String args[])throws Exception{
 	int x,y;
Scanner sc=new Scanner (System.in);
System.out.println("Enter the first number");
x=sc.nextInt();
System.out.println("Enter the second number");
y=sc.nextInt();
	
	try{
		if(x==0||y==0)
{
			throw new Exception();
}
 else
     System.out.println("Sum of number:"+(x+y));
}
	catch(Exception e)
{
   System.out.println("Enter with only non-zero value");
}
     finally{
    System.out.println("Exception Successfully");
    }
}
}
