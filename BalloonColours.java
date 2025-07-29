public class BalloonColours{
public static void main(String[] args){
int n = 7;
char[] B={'r','g','b','y','g','b','y'};
for(int i=0; i<n; i++){
   boolean checked = false;
  for(int k=0; k<i; k++){
    if(B[i]==B[k]){
       checked = true;
       break;
}
}
if(!checked){
int count=0;
for(int j=0; j<n; j++){
    if(B[i]==B[j]){
        count++;
}
}
if(count%2!=0){
System.out.print(B[i]+ " ");
}
}
}
}
}
