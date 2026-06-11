class Solution {
    public int search(int[] nums, int target) {
        int right = nums.length - 1;
        int left = 0;
        while(left <= right){
           int meio = (left + right)/2;
           if(nums[meio] == target){
            return meio;
           }else if(nums[meio] < target){
            left = meio + 1;
           }else if(nums[meio] > target){
            right = meio - 1;
           }
        }
        return -1;
    }
}
