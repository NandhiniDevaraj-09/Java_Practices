import java.util.Scanner;
public class AbundantMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows,cols;
        System.out.println("Enter the number of rows and columns:");
        rows= sc.nextInt();
        cols= sc.nextInt();
        int[][] m= new int[rows][cols];
        System.out.println("Enter the elements of the matrix:");
        for (int i= 0; i< rows; i++) {
            for (int j= 0; j< cols; j++) {
                m[i][j]= sc.nextInt();
            }
        }
        int abundantCount =0;
        for (int i= 0; i< rows; i++) {
            for (int j= 0; j< cols; j++) {
                if (isAbundant(m[i][j])) {
                    abundantCount++;
                }
            }
        }
        if (abundantCount%2 == 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
        sc.close();
    }
    public static boolean isAbundant(int num) {
        int sum = 0;
        for (int i=1; i<=num/2; i++) {
            if (num%i==0) {
                sum+=i;
            }
        }
        return sum>num;
    }
}