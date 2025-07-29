public class BasicNeonNumber{
  public static void main(String[] args){
     int n = 9;
     int sqr = n * n;
     int sum = 0;
     while(n > 0){
        int dig = sqr % 10;
        sum += dig;
        sqr /= 10;
}
if(n==sum){
System.out.println("The given number is a Neon number");
}
else{
System.out.println("The given number is not a Neon number");
}
}
}


