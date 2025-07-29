public class basicSumofDigits{
  public static void main(String[] args){
      int n = 123;
      int sum = 0;
      while(n != 0){
          int rem = n % 10;
          sum +=rem;
          n /= 10;
      }
   System.out.print(" The sum of the digits of the given number is: "+ sum);
}
}