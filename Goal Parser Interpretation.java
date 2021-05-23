class Solution {
    public String interpret(String command) {
        String s = command.replace("()", "o");
        s = s.replace("(al)", "al");
        return s;

    }

}
