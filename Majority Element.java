class Solution {
    public int majorityElement(int[] nums) {
        int count = 0;
        int num = 0;
        Arrays.sort(nums);
        if (nums.length == 1) {
            num = nums[0];
        }
        for (int i = 0; i < nums.length - 1; i++) {
            count++;
            if (nums[i] == nums[i + 1]) {
                // count++;

                if (count >= nums.length / 2) {
                    num = nums[i];
                    break;
                }
            } else {
                count = 1;

            }

        }
        return num;
    }
}