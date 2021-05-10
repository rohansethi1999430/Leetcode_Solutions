class Solution {
    public String removeDuplicates(String S) {
        Stack<Character> x = new Stack<>();
        for (int i = 0; i < S.length(); i++) {
            if (!x.isEmpty() && (char) x.peek() == S.charAt(i)) {
                x.pop();
            } else {
                x.push(S.charAt(i));
            }
        }
        String f = "";
        Iterator<Character> it = x.iterator();

        while (it.hasNext()) {
            f = f + it.next();
        }

        return f;
    }
}