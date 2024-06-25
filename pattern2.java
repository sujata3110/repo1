import java.util.Scanner;
class Pattern 
{   
	public static void main(String[] args)    
{   
	int i, j, k, n; 
      System.out.print("Enter the value of n: ");  
	Scanner sc= new Scanner(System.in);  
	n=sc.nextInt();  
   for (i = 1; i <= n; i++)    
{   
   for (j = 1; j <= n; j++)   
{   
         k= i < j ? i : j;   
	System.out.print(n - k + 1+ " ");   
}    
     for (j = n - 1; j >= 1; j--)   
{   
	k = i < j ? i : j;   
	System.out.print(n - k + 1+ " ");   
}   
	System.out.println("");   
}   
  for (i = n - 1; i >= 1; i--)    
{   
  for (j = 1; j <= n; j++)    
{   
	k = i < j ? i : j;   
	System.out.print(n - k + 1+ " ");   
}   
     for (j = n - 1; j >= 1; j--)    
{   
	k = i < j ? i : j;   
	System.out.print(n - k + 1+ " ");   
}   
	System.out.println("");   
}   
}   
}   
