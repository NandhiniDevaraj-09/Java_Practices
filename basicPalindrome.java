class basicPalindrome{
  public static void main(String[] args){
       int n = 123;
       int temp = n;
       int rev = 0; 
       while(n != 0){
          int rem = n % 10;
          rev = rev * 10 + rem;
          n /= 10;
       }
       if(temp == rev){
       System.out.print("It is a Palindrome");}
       else{
       System.out.print("It is not a Palindrome");}

}
}