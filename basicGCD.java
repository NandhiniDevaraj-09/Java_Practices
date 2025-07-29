 public class basicGCD {
    public static void main(String[] args) {
         int a = 36;
         int b = 60;
         int next;
         while(b != 0){
           next = a % b;
           a = b;
           b = next;
         }
         System.out.print("The GCD is: "+a);
}
}
