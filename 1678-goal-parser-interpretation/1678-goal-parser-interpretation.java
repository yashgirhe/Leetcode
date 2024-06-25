class Solution {
    public String interpret(String command) {
        command = command.replace("(al)","al").replace("()","o");
        return command;
    }
}