public class cruiseEntryExit{
public static void main(String [] args){
int[] E = {7,0,5,1,3};
int[] L = {1,2,1,3,4};
int t = E.length;
int temp=0;
int bal=0;
for(int i=0; i<t; i++){
  bal = bal + E[i] - L[i];
    if(bal > temp){
      temp = bal;
    }
}
System.out.println("the max number people present in any hour is: " + temp);
}
}