import java.io.*;
class Test{
          public static void main(String args[])throws 
FileNotFoundException,IOException
{
     FileInputStream fin=new FileInputStream("file.txt");
     FileOutputStream fout=new FileOutputStream("xyz.txt");
int k=0;	
while(k!=-1)
{
k=fin.read();
fout.write((char)k);
}
fout.close();
System.out.println("Successfully.....");
}
}