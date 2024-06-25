import java.io.*;
class Test{
          public static void main(String args[])throws 
IOException
{
FileReader fread= new FileReader("file1.txt");
FileWriter fwrite= new FileWriter("abc.txt");
int k=0;
while(k!=-1)
{
k=fread.read();
fwrite.write((char)k);
}
fwrite.close();
System.out.print("Successfully");
}
}