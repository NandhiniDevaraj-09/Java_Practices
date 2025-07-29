import java.util.Scanner;

public class ArrayLeftRotation {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        int n = s.nextInt();
        int[] a = new int[n];
        
        for (int i = 0; i < n; i++) {
            a[i] = s.nextInt();
        }
        
        int d = s.nextInt();
        
        for (int i = 0; i < d; i++) {
            int first = a[0]; 
            for (int j = 0; j < n - 1; j++) {
                a[j] = a[j + 1];             }
                a[n - 1] = first;         }
        
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
    }
}