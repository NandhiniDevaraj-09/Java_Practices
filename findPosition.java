import java.util.Scanner;
class findPosition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of array elements: ");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter the array elements: ");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("Enter the target value: ");
        int target = sc.nextInt();
        int i;
        for (i = 0; i < n; i++) {
            if (a[i] == target) {
                System.out.println("The position of the target value is: " + i);
                return;
            } else if (a[i] > target) {
                System.out.println("The possible position of the target value in the array is: " + i);
                return;
            }
        }
        sc.close();
    }
}