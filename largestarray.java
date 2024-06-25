import java.util.Scanner;

class Test
{
    public static void main(String[] args) {
          int n, largest,i;
          int arr[] = new int[5];
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
         n = sc.nextInt();
                System.out.println("Enter elements:");
        for ( i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

         largest = arr[0]; 
        for ( i = 1; i < n; i++) {
            if (arr[i] > largest) {
                largest = arr[i]; 
            }
        }
       System.out.println("The largest element in the array is: " + largest);
    }
}
