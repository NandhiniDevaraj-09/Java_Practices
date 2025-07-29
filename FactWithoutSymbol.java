public class FactWithoutSymbol {
    public static void main(String[] args) {
        int n = 7;

        for (int i = 1; i <= n; i++) {
            int fact = 1;

            for (int j = 1; j <= i; j++) {
                int sum = 0;

                for (int k = 0; k < fact; k++) {
                    sum+= j;
                }
 
               fact = sum;
            }
            System.out.println("Factorial of " + i + " is: " + fact);
        }
    }
}