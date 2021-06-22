class Solution {
    public boolean halvesAreAlike(String s) {
        int half = s.length() / 2;
        int count1 = 0;
        int count2 = 0;
        // String first_half=s.substring(0,half);
        // String second_half=s.substring(half,s.length());//
        s = s.toLowerCase();
        for (int i = 0; i < half; i++) {
            if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o'
                    || s.charAt(i) == 'u') {
                count1++;
            }
        }
        for (int i = half; i < s.length(); i++) {
            if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o'
                    || s.charAt(i) == 'u') {
                count2++;
            }
        }
        if (count1 == count2) {
            return true;
        } else
            return false;
    }

}
