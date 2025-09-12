class Solution {
    public int longestValidParentheses(String s) {
        Stack<Integer> stack=new Stack<>();
        int mx=0;
        stack.push(-1);
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
                if(ch=='('){
                    stack.push(i);
                }
                else{
                    stack.pop();
                    if(stack.isEmpty()) stack.push(i);
                    if(!stack.isEmpty()) {
                        mx=Math.max(mx,i-stack.peek());
                    }
                }
            }
         return mx;
       

        
    }
}