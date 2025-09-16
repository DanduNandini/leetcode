class Solution {
    public int calculate(String s) {
        int res=0 ,n=0,sign=1;
        Stack <Integer> stack=new Stack<>();
        for( int i=0;i<s.length();i++){
         char ch=s.charAt(i);
          if(Character.isDigit(ch)){
              n=n*10+(ch-'0');
          }
            else if(ch=='+'|| ch=='-'){
                res+=n*sign;
                 n=0;
                if(ch=='+') sign=1;
                if(ch=='-') sign=-1;
            }
            else if(ch=='('){
                stack.push(res);
                stack.push(sign);
                res=0;
                sign=1;
            }
            else if(ch==')'){
                res=res+n*sign;
                res=res*stack.pop();
                res=res+stack.pop();
                 n=0;
            }

        }
        return res+(n*sign);

    }
}