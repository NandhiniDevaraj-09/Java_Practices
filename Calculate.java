import java.util.Scanner;
class Calculate {
    void operation(int n, int firstTerm, int secondTerm) {
        System.out.println("Fibonacci series till " + n + " terms:");
        for (int i = 1; i <= n; ++i) {
            System.out.print(firstTerm + ", ");
            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
        System.out.println(); 
    }
    void operation(int num, long factorial) {
        for (int i = 1; i <= num; ++i) {
            factorial *= i;
        }
        System.out.printf("\nThe factorial of %d = %d\n\n", num, factorial);
    }
    void operation(int num) {
        int count = 0;
        if (num <= 1) {
            System.out.println(num + " is not a prime number.");
        } else {
            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    count++;
                    break; 
                }
            }
            if (count == 0) {
                System.out.println( num + " is a prime number.");
            } else {
                System.out.println( num + " is not a prime number.");
            }
        }
    }
    public static void main(String[] args) {
        Calculate calc = new Calculate();
        calc.operation(10, 0, 1);  
        calc.operation(10, 1);     
        calc.operation(1);        
    }
}