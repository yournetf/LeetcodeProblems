class Solution {
    public boolean isValid(String s) {
        char[] characters = s.toCharArray();
        Stack<Character> stack = new Stack<>();
        for(char symbol: characters){
            if(symbol == '(' || symbol =='{' || symbol =='['){
                stack.push(symbol);
            }
            else{
                if(stack.isEmpty()) {
                    return false;
                }
                if(symbol == ')'){
                    if(stack.pop() != '(') return false;
                }

                if(symbol == '}'){
                    if(stack.pop() != '{') return false;
                }

                if(symbol == ']'){
                    if(stack.pop() != '[') return false;
                }
            }
        }
        if(stack.isEmpty()) return true;
        else return false;
    }
}
