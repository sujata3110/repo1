import java.util.*;
class Test{
   public static void main(String args[])throws Exception{

 String name;
String password;
Scanner sc=new Scanner (System.in);
System.out.println("Enter the name");
name=sc.nextLine();
System.out.println("Enter the password");
password=sc.next();

	try{
 	if(password.length()>7)
{
	throw new Exception();
}
 else 
    System.out.println("You are logged in");
}
	    catch(Exception e){
            System.out.println("Password is length is should not be exceed 7 ");
}
	finally
{
	System.out.println("Exception successfully");
}
}
}