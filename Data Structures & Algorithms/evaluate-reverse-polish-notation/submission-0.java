class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> s1 = new Stack<>();

        for(int i = 0; i < tokens.length; i++)
        {
            String token = tokens[i];
            if(token.equals("+") )
            {
                int first = s1.pop();
                int second = s1.pop();
                int result  = second + first;
                s1.push(result);
            }
            else if(token.equals("-")){
                int first = s1.pop();
                int second = s1.pop();
                int result  = second - first;
                s1.push(result);

            }else if(token.equals("*")){
                int first = s1.pop();
                int second = s1.pop();
                int result  = second * first;
                s1.push(result);

            }else if(token.equals("/")){
                int first = s1.pop();
                int second = s1.pop();
                int result  = second / first;
                s1.push(result);

            }else {

                int number = Integer.parseInt(token);
                s1.push(number);
            }
        }
        return s1.pop();
    }
}
