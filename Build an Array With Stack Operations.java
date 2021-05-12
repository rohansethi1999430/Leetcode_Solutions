class Solution {
    public List<String> buildArray(int[] target, int n) {
        ArrayList<String> al = new ArrayList<>();
        int f = 0;
        for (int i = 0; i < n; i++) {
            if (target.length <= f) {
                break;
            }
            al.add("Push");

            if (target[f] == i + 1) {
                f++;
            } else {
                al.add("Pop");
            }
        }
        return al;
    }
}