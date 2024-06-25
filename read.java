import java.io.*;
class Test{
          public static void main(String args[])throws
       FileNotFoundException,IOException{
  int k=0;
  FileInputStream fin=new FileInputStream("file.txt");
  while(k!=-1){
   k=fin.read();
  System.out.print((char)k);
}
}
}