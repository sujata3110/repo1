import java.util.*;
   class Test{
	public static void main(String args[]){
 	
	int n1=0,n2=1,n3,i,n;
  	Scanner sc=new Scanner (System.in);
        System.out.println("Enter the number");
	n=sc.nextInt();
 System.out.print(n1+" "+n2);  
    
 for(i=2;i<n;++i)
 {    
  n3=n1+n2;    
  n1=n2;    
  n2=n3;   
System.out.print(" "+n3);    
   
 }    
  
}}  
