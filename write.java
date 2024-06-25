import java.io.*;
class Test{
          public static void main(String args[])throws IOException{
  	FileOutputStream fout=new FileOutputStream("file1.txt");
	String z="Data is Successfully";
 	byte[] b=z.getBytes();
	fout.write(b);
	fout.close();
System.out.println("Write operation Successfully.....");
}
}