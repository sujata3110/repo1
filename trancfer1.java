import java.io.*;
class Test{
          public static void main(String args[])throws 
IOException
{
FileWriter fwrite= new FileWriter("abc.txt");
String z="operation is success";
fwrite.write(z);
fwrite.close();
System.out.print("Successfully");
}
}