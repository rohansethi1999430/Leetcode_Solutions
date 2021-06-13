class Solution {
    public int findNumbers(int[] nums) {
        int count=0;
        int temp=0;
        for(int i=0;i<nums.length;i++){
            temp=0;
            while(nums[i]>=10){
               
                nums[i]=nums[i]/10;
                temp++;
            }
            temp++;
            if(temp%2==0){
                count++;
            }
        }
        return count;
    }
}