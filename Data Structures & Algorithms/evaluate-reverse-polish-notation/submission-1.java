class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
         for(String str : tokens) {
            if(str.equals("+") || str.equals("*") || str.equals("-") || str.equals("/")) {
                int b = stack.pop();
                int a = stack.pop();
                
                   int result =  switch(str) {
                        case "+" -> a+b;
                        case "*" -> a*b;
                        case "-" -> a-b;
                        default -> a/b;
                    };
                    stack.push(result);
               
            } else {
                stack.push(Integer.parseInt(str));
            }
        }
        return stack.pop();
    }
}
