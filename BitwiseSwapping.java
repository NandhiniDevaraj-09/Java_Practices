import java.util.Scanner;
public class BitwiseSwapping{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter any two numbers to swap:");
int a=sc.nextInt();
int b=sc.nextInt();
a=a^b;
b=a^b;
a=a^b;
System.out.println(a);
System.out.println(b);

}
}