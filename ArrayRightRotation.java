import java.util.Scanner;

public class ArrayRightRotation {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        int n = s.nextInt();
        int[] a = new int[n];
        
        for (int i = 0; i < n; i++) {
            a[i] = s.nextInt();
        }
        
        int k = s.nextInt();
        
        for (int i = 0; i < k; i++) {
            int temp = a[n - 1];
            
            for (int j = n - 1; j > 0; j--) {
                a[j] = a[j - 1];
            }
            
            a[0] = temp;
        }       
        
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
    }
}