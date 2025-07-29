import java.util.Arrays;
class ArrayDuplicate{
public static void main(String[] args){
int[] a={5,2,3,1,5,4,4};
Arrays.sort(a);
int temp[] = new int[a.length];
int j=0;
for(int i=0;i<a.length-1;i++){
if(a[i]!=a[i+1]){
  temp[j++]=a[i];
}
}
temp[j]=a[a.length-1];
for(int i=0;i<=j;i++){
System.out.print(temp[i]);
}
}
}