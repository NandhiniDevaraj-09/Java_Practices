import java.util.Scanner;
public class BitwiseAndOddEven{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number:");
int n=sc.nextInt();
if(n&1==0){
System.out.println("The given number is Even");
}
else{
System.out.println("The given number is Odd");
}
}
}