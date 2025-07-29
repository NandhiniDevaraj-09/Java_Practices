public class basicHarshadNumber{
  public static void main(String[] args){
     int n = 23;
     int temp = n;
     int sum = 0;
     while(n!=0){
     int rem = n % 10;
         sum += rem;
         n /= 10;
     }
     if(temp % sum == 0){
     System.out.print("It is a harshad number");
     }else{
     System.out.print("It is not a harshad number");
     }
   }
}  
