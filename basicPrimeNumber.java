public class basicPrimeNumber{
public static void main(String[] args){
     int n = 16;
     int count = 0;
     for(int i = 2;i < n; i++){
          if(n%i==0){
            count++;
            break;
          }
}

     if(count == 0){
     System.out.print("It is a prime number");
    }else{
    System.out.print("It is not a prime number");
    }
   }
}  
