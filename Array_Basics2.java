import java.util.Scanner;

public class Array_Basics2 {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
        
System.out.print("Enter the array size: ");
int n = sc.nextInt();
        
int arr[] = new int[n];

System.out.println("Enter " + n + " elements:");
for(int i = 0; i < n; i++) {
arr[i] = sc.nextInt();
}

int min = arr[0];
int max = arr[0];

for(int i = 1; i < n; i++) {
if(arr[i] < min)
min = arr[i];
if(arr[i] > max)
max = arr[i];
}
System.out.println("Minimum value in the array is: " + min);
System.out.println("Maximum value in the array is: " + max);

sc.close();
}
}
