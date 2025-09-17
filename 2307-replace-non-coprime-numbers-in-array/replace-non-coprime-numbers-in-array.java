class Solution {
    public List<Integer> replaceNonCoprimes(int[] nums) {
        int  n=nums.length;
        int [] st= new int[n];
        int top=-1;
        for(int i:nums){
            while(top!=-1){
                 int g= gcd(i,st[top]);
                if(g==1)  break;
                else i*=st[top--]/g;
            }
            st[++top]=i;
        }
        List<Integer> res=new ArrayList<>();
        for(int i=0;i<=top;i++){
            res.add(st[i]);
        }
        return res;
    }
    public static int gcd(int a,int b){
        return (b==0)?a:gcd(b,a%b);
    }
}