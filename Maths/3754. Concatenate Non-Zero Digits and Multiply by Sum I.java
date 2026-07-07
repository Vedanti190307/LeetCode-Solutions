class Solution {
    public long sumAndMultiply(int n) {
        StringBuilder sb=new StringBuilder();
        int sum=0;
        if(n==0){
            return 0;
        }
        while(n>0){
            int digit=n%10;
            if(digit!=0){
                sum=sum+digit;
                sb.append(digit);
            }
            n=n/10;
        }
        sb.reverse();
        long x=Long.parseLong(sb.toString());
        return x*sum;
    }
}


/*  This code is also work and it is better way if you don't want to use stringbuilder.
class Solution {
    public long sumAndMultiply(int n) {
        int sum=0;
        long x=0;
        int place=1;
        while(n>0){
            int digit=n%10;
            if(digit!=0){
                x=x+(digit*place);
                sum=sum+digit;
                place=place*10;
            }
            n=n/10;
        }
        return x*sum;
    }
}
*/