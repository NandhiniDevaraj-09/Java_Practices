class AddLoop{
    public static void main(String[] args){
        int a=24;
        int b=1;
        int reverse=0;
        int rev=0;
        int add=0;
        int result=0;
        while(a!=0){
            int digit=a%10;
             reverse=reverse*10+digit;
            a/=10;
         }
        while(b!=0){
            int digit=b%10;
            rev=rev*10+digit;
            b/=10;
        }
       add=reverse+rev;
       while(add!=0){
            int digit=add%10;
            result=result*10+digit;
            add/=10;
         }
       System.out.println(result);
        
    }
}