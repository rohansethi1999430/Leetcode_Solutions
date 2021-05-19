class Solution {
    public int balancedStringSplit(String s) {
        int rc = 0;
        int lc = 0;
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'R') {
                rc++;
            } else {
                lc++;
            }
            if (lc == rc) {
                count++;
            }
        }
        return count;
    }
}