import java.util.Scanner;
class Test{
 		public static void main(String args[]){
	int i,j,n,k;
 Scanner sc=new Scanner(System.in);
   System.out.println("Enter number of row");
n=sc.nextInt();
k=1;
for(i=0;i<n;i++){
     for(j=n-i;j>0;j--){
	System.out.print(" ");
}
 for(j=0;j<2*i+1;j--){
	System.out.print(k);
k++;
}

System.out.println("");
}
}
}
