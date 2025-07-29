 class ArrayZeros{
    public static void main(String[] args) {
        int a[] = {0, 2, 13, 0, 0, 5,9,38,0};
        int n = a.length;
        int b[]=new int[a.length];
        int j=0;
        for(int i=0;i<n;i++){
            if(a[i]!=0){
               b[j++]=a[i]; 
            }
        }
            while(j<n){
                b[j++]=0;
            }
             for(int i=0;i<n;i++){
             System.out.print(b[i] +" ");
        }
       
    }
}