class Solution {
    public int evalRPN(String[] tokens) {
        Deque<Integer> res = new ArrayDeque<>();

        for(String token:tokens){
            if(token.equals("+")||
            token.equals("-")||
            token.equals("*")||
            token.equals("/")){
                int b=res.pop();
                int a=res.pop();

                int result=0;

                if(token.equals("+")){
                    result=a+b;
                }else if(token.equals("-")){
                    result=a-b;
                }else if(token.equals("*")){
                    result=a*b;
                }else {
                    result=a/b;
                }
                res.push(result);
            }else{
                res.push(Integer.parseInt(token));
            }
        }
        return res.pop();
    }
}
