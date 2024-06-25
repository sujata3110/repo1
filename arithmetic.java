import java.util.Scanner;
class Test{
 public static void main(String args[]){
 
	int x,y,z;
Scanner sc=new Scanner(System.in);
   System.out.println("Enter  first number");
 x=sc.nextInt();
       System.out.println("Enter second number");
y=sc.nextInt();
 	z=x+y;
       z=x-y;
	z=x*y;
	z=x/y;
	z=x%y;
System.out.println("Sum="+z);
System.out.println("Sub="+z);
System.out.println("Mul="+z);
System.out.println("Div="+z);
System.out.println("Modul="+z);
}
}
