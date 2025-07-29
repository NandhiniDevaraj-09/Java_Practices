class ArraySumPairs {
    public static void main(String[] args) {
       int[] a={2,3,6,5,1,4,0};
       int n=5;
       int total=0;
        for(int i=0;i<a.length;i++){
          for(int j=i+1;j<a.length;j++){
              if(a[i]+a[j]==n){
                   System.out.println("pairs found: "+a[i]+" and "+a[j]);
                  total++;
                 
              }
        }
        }
        System.out.println("\ntotal no.of.pairs:"+total);
}
}