import java.util.*;
class Test {
    public static void main(String[] args) {
        int x,y;
     Scanner sc=new Scanner(System.in);
       		System.out.println("Enter first number");
x=sc.nextInt();
            System.out.println("Enter second number");
y=sc.nextInt();
             try
		{
 		System.out.println("x/y="+(x/y));
		}
      catch(ArithmeticException e){
                 System.out.println("second number  cannot be Be zero");
  		}
 finally{
   System.out.println("Exception Successfully Handled");
}
   }
}


