class Solution {
    public int triangularSum(int[] nums) {
        int n = nums.length;
        if(n==1) return nums[0];

        return helper(nums, n);
    }

    int helper(int[] nums, int n){
        if(n==1) return nums[0];

        int[] ans = new int[n-1];
        for(int i=0;i<n-1;i++){
            ans[i] = (nums[i] + nums[i+1]) % 10;
        }
        return helper(ans, n-1);
    }
}