import java.util.Scanner;
public class AreaCalculator{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.print("Enter the base and height of the triangle: ");
double b=sc.nextInt();
double h=sc.nextInt();
double Area=0.5*b*h;
System.out.print("The area of the triangle is: "+ Area);
}
}

