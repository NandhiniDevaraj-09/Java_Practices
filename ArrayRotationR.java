public class ArrayRotationR {
    public static void main(String[] args) {
        int[][] a = new int[3][3]; 
        int k = 1;
        int n = 3;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = k++;
            }
        }
        System.out.println("Original Array:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("%3d", a[i][j]);
            }
            System.out.println();
        }
        for (int i = 0; i < n; i++) {
            int last = a[i][n-1];
            for (int j = n-1; j > 0; j--) {
                a[i][j] = a[i][j-1];
            }
            a[i][0] = last;
        }
        System.out.println("Array after Right Rotation:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("%3d", a[i][j]);
            }
            System.out.println();
        }
    }
}
