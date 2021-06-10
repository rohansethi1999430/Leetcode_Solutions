class Solution {
    public int maxProduct(int[] nums) {
        int max=Integer.MIN_VALUE;
        int n=0;
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length;j++){
                
              n=(nums[i]-1)*(nums[j]-1);
                if(n>max && i!=j){
                    max=n;
                }
            }
        }
        return max;
    }
}