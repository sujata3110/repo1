import java.util.Scanner;
 //Business logic

class Addition{
 int sum(int x, int y){
 int z=x+y;
 return z;
}
}

// Execution logic Class
 class Test{
 public static void main(String args[]){
  int x,y,z;
Scanner sc=new Scanner(System.in);
System.out.println("Enter First number");
x=sc.nextInt();
System.out.println("Enter second number");
y=sc.nextInt();
 Addition obj=new Addition();
int r=obj.sum(x,y);
System.out.println("sum="+r);
}
}
 
