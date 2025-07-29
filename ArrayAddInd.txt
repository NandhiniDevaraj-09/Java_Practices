class ArrayAddInd{
    public static void main(String[] args) {
        int a[] = { 5,7,2,11};
        int n=9;
        for(int i=0;i<a.length-1;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]+a[j]==n){
                    System.out.print(i+" "+j);
                    break;
                     }
            }
        }
    }
}