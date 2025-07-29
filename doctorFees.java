import java.util.Scanner;

public class doctorFees {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        int n = s.nextInt();
        if(n>20){
          System.out.print("the max limit is 20");
        }else{
        int[] a = new int[n];
        
        for (int i = 0; i < n-1; i++) {
        System.out.print("Enter patients age: ");
            a[i] = s.nextInt();
        }
        int total=0;
        int inr=0;;
        for(int i=0;i<n;i++){
         if(a[i]<17){
             inr=200;
         }else if(a[i]>=17 && a[i]<=40){
             inr=400;
         }else{
             inr=300;
         }
         total+=inr;
         }
         System.out.print(total);
}
}
}