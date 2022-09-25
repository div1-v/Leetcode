class Solution {
    public int longestSubarray(int[] nums) {
        int ans=0;
        int max=0;

        for(int i=0;i<nums.length;i++){
            max=Math.max(max,nums[i]);
        }
        int curr=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==max){
                curr++;
            }else{
                ans=Math.max(curr,ans);
                curr=0;
            }
        }
        ans=Math.max(curr,ans);
        return ans;
    }
}