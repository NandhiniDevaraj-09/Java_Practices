public class basicLCM {
    public static void main(String[] args) {
         int a = 36;
         int b = 60;
         int next;
         int c = a * b;
         while(b != 0){
           next = a % b;
           a = b;
           b = next;
         }
         int result = c / a;
         System.out.print("The LCM is: "+result);
}
}
