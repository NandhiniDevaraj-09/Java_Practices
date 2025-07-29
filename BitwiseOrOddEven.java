import java.util.Scanner;
public class BitwiseOrOddEven{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number:");
int n=sc.nextInt();
if((n|1)==n){
System.out.println("The given number is Odd");
}
else{
System.out.println("The given number is Even");
}
}
}