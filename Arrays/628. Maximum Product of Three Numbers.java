class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        int p1=nums[n-1]*nums[n-2]*nums[n-3];//largest 3 no
        int p2=nums[0]*nums[1]*nums[n-1];//if no are negative
        return Math.max(p1,p2);
    }
}