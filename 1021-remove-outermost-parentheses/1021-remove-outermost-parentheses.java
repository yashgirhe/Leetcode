class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder sb = new StringBuilder();
        //0 -> outermost parentheses
        int counter = 0;
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if(c == '(' && counter == 0) counter++;
            else if(c == '(' && counter >= 1){
                sb.append(c);
                counter++;
            }
            if(c == ')' && counter > 1){
                sb.append(c);
                counter--;
            }
            else if(c == ')' && counter == 1) counter--;
        }
        return sb.toString();
    }
}