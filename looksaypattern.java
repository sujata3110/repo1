import java.util.Scanner;

class Pattern {
   
    void generatePattern() {
        int n;
        if (n <= 0) {
            return;
        }

        
        String term = "1";
        System.out.println(term);

        
        for (int i = 1; i < n; i++) {
            term = getNextTerm(term);
            System.out.println(term);
        }
    }

    private String getNextTerm(String term) {
        StringBuilder nextTerm = new StringBuilder();
        int count = 1;

      
        for (int i = 1; i < term.length(); i++) {
            if (term.charAt(i) == term.charAt(i - 1)) {
                count++;
            } else {
                nextTerm.append(count).append(term.charAt(i - 1));
                count = 1;  
      }
        }
        nextTerm.append(count).append(term.charAt(term.length() - 1));

        return nextTerm.toString();
    }
}

class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of terms:");
        int n = sc.nextInt();
        sc.close();
        
        Pattern obj = new Pattern();
        obj.generatePattern(n);
    }
}
