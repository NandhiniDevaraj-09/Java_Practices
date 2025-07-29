import java.util.Scanner;

public class EmptyPackets{
   public static void main(String[] args){
   Scanner s = new Scanner(System.in);
   int n = s.nextInt();
   int[] a = new int[n];
   for(int i = 0; i < n; i++){
      a[i] = s.nextInt();
   }
   int count = 0;
   for(int i = 0; i < n; i++){

      if(a[i] != 0) {
        System.out.print(a[i]);
       }
      else {
       count++;
     }
    }
    for(int i = 0; i < count ; i++){
        System.out.print(0);

    }
   s.close();
  }
}
