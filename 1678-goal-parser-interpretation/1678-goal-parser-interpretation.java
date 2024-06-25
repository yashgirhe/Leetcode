class Solution {
    public String interpret(String command) {
         StringBuffer sb = new StringBuffer();
        int i = 0;
        while (i < command.length()) {
            if (command.charAt(i) == 'G') {
                sb.append("G");
                i++;
            }
            else if (command.charAt(i) == '(' && command.charAt(i + 1) == ')') {
                sb.append("o");
                i += 2;
            } else {
                sb.append("al");
                i += 4;
            }
        }
        return sb.toString();
    }
}