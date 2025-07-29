import java.util.Scanner;
public class BinaryAddition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);       
        System.out.print("Enter first binary number: ");
        String a = sc.next();       
        System.out.print("Enter second binary number: ");
        String b = sc.next();        
        sc.close();
while(a.length()>b.length()){
       b ='0'+ b;
}
while(b.length()>a.length()){
       a ='0'+ a;
}
String result ="";
int carry=0;
for(int i=a.length()-1;i>=0;i--){
int n=a.charAt(i)-'0';
int m=b.charAt(i)-'0';
int sum = n+m+carry;
int rem = sum %2;
carry = sum /2;
result = (char)(rem + '0')+result; 
}
if(carry!=0){
result = carry + result;
}
System.out.print("sum:" +result);

}
}

       