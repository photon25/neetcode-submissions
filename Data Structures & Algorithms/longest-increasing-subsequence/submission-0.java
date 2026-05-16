class Solution {
    public int lengthOfLIS(int[] nums) {
        int []dp=new int[nums.length];
            for(int i=0;i<nums.length;i++){
                dp[i]=1;
            } 
            int max1=1;
            for(int i=1;i<nums.length;i++){
                int num=nums[i];
               for(int j=0;j<i;j++){
                if (nums[i] > nums[j]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
               }
               max1=Math.max(max1,dp[i]);
            }
            return max1;
    }
}
