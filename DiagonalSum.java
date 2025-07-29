import java.util.Scanner;
class DiagonalSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter the number of columns: ");
        int cols = sc.nextInt();
        if (rows != cols) {
            System.out.println("Matrix should be square to calculate diagonals.");
            return;
        }
        System.out.print("Enter the array elements: ");
        int[][] a = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("The matrix is:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        int primaryDiagonalSum = 0;
        int secondaryDiagonalSum = 0;
        for (int i = 0; i < rows; i++) {
            primaryDiagonalSum += a[i][i];
            secondaryDiagonalSum += a[i][rows - i - 1];
        }
        System.out.println("Sum of the primary diagonal: " + primaryDiagonalSum);
        System.out.println("Sum of the secondary diagonal: " + secondaryDiagonalSum);
    }
}
