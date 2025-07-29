import java.util.Scanner;

public class Equilibrium {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        int n = s.nextInt();
        int[] a = new int[n];
        
        for (int i = 0; i < n; i++) {
            a[i] = s.nextInt();
        }

        int totalSum = 0;
        int leftSum = 0;

        for (int i = 0; i < n; i++) {
            totalSum += a[i];
        }

        boolean found = false;
        for (int i = 0; i < n; i++) {
            totalSum -= a[i];
            
            if (leftSum == totalSum) { 
                System.out.println(i);
                found = true;
                break;
            }
            
            leftSum += a[i]; 
        }
        
        if (!found) {
            System.out.println("No equilibrium index found");
        }
    }
}