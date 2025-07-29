 public class basicCountdigits {
    public static void main(String[] args) {
        int n = 1530; 
        int count = 0;
        while (n != 0) {
            n /= 10;
            count++;
        }
      System.out.print(" the number of digits in the given number are: "+ count);
}
}