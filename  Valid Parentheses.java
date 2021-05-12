class Solution {

    public boolean isValid(String s) {
        boolean x = false;
        Deque<Character> d = new ArrayDeque<>();
        for (int i = 0; i < s.length(); i++) {
            // if(d.isEmpty())

            if (s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') {
                d.push(s.charAt(i));
            }
            if (!d.isEmpty()) {
                if (s.charAt(i) == ')' && d.peek() == '(') {
                    d.pop();
                } else if (s.charAt(i) == '}' && d.peek() == '{') {
                    d.pop();
                } else if (s.charAt(i) == ']' && d.peek() == '[') {
                    d.pop();
                } else if (s.charAt(i) == ')' && d.peek() != '(') {
                    return false;
                } else if (s.charAt(i) == '}' && d.peek() != '{') {
                    return false;
                } else if (s.charAt(i) == ']' && d.peek() != '[') {
                    return false;
                }

            } // (

            else {
                return false;
            }
        }

        if (d.isEmpty()) {
            x = true;
        }
        return x;
    }
}
