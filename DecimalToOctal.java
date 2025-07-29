import java.util.Scanner;

public class DecimalToOctal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a decimal number: ");
        int dec = sc.nextInt(); 
        sc.close(); 
        String octal=""; 
        while (dec > 0) {
          int rem =dec%8;
          octal=rem+octal;
          dec/=8;
        }
        System.out.println(octal);     
}
}
