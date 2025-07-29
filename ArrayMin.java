 
   class ArrayMin{
    public static void main(String[] args) {
        int a[] = { 2, 13, 5,9,38};
        int max=Integer.MAX_VALUE;
        for(int i=0;i<a.length;i++){
            if(a[i]<max){
                max=a[i];
            }
        }
       System.out.println(max);
    }
}