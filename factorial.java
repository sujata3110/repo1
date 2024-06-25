import java.util.*;
class Sample {
    int show(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
}

class Test {
    public static void main(String args[]) {
        int n;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number");
n=sc.nextInt();
       Sample s1 = new Sample(); 
        int fact = s1.show(n); 
        System.out.println("Factorial of " + n + " is: " + fact);
    }
}
