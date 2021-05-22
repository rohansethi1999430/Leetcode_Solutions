class Solution {
    public void moveZeroes(int[] nums) {
        ArrayList<Integer> al = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            al.add(nums[i]);
        }
        // System.out.println(al);

        for (int i = 0; i < al.size(); i++) {
            if (al.get(i) == 0) {
                al.remove(i);
                // System.out.println(al);
                al.add(0);
                // System.out.println(al);
            }
        }
        for (int i = 0; i < al.size(); i++) {
            if (al.get(i) == 0) {
                al.remove(i);
                // System.out.println(al);
                al.add(0);
                // System.out.println(al);
            }
        }
        for (int i = 0; i < nums.length; i++) {
            nums[i] = al.get(i);
        }

    }
}