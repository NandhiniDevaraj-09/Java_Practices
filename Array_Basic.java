import java.util.Scanner;
public class Array_Basic {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n =sc.nextInt();
      int arr[]=new int[n];
      for(int i=1;i<=arr.length;i++){
          System.out.print(i);
      }
      System.out.print("  ");
      int arr1[]=new int[n*2];
      for(int i=1;i<=arr1.length;i++){
          System.out.print(i);
      }
      System.out.print("  ");
      for(int i=1;i<=arr1.length;i=i+2){
          System.out.print(i);
      }
      System.out.print("  ");
     for(int i=2;i<=arr1.length;i=i+2){
          System.out.print(i);
      }
      System.out.print("  ");
    }
}