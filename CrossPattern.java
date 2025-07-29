public class CrossPattern{
public static void main(String[] args){
int n=5;
int mid=n/2;
for(int i=1;i<=n;i++){
   for(int j=1;j<=n;j++){
       if(j==i){
           if(i>mid){
              System.out.print(j);
          }
           else
             System.out.print(n-i+1);
        }
        else if(j==(n-i-1)){
           if(i>mid){
              System.out.print(j);
        }
          else
             System.out.print(i);
         }
        else{
         System.out.print(" ");
        }
    }
 System.out.println();
}
}
}