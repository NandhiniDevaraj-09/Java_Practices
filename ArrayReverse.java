class ArrayReverse{
 public static void main(String[] args){
     int a[]={1,2,3,4,5};
     int t[]=new int[a.length];
     int n=a.length;
     a[0]=a[n-1];
     for(int i=0;i<n-1;i++){
         int t;
         t=a[0];
         a[0]=a[n-1];
         a[n-1]=t;
     }
         System.out.print(a[i]+" ");
     }
 }  