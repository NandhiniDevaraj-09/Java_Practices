import java.util.Scanner;

public class DecimalToHexadecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a decimal number: ");
        int dec = sc.nextInt(); 
        sc.close(); 
        String hex=""; 
        while (dec > 0) {
          int rem =dec%16;
          if(dec<10){
          hex=rem+hex;
        }else {
          hex = (char) (rem - 10 + 'A') + hex;             
         }
          dec/=16;             
}
System.out.println(hex); 
}
}