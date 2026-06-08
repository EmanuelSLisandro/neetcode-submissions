class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> vistos = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            int complementos = target - nums[i];

            if(vistos.containsKey(complementos)){
                return new int[]{vistos.get(complementos), i};
            }else{
                vistos.put(nums[i], i);
            }
        }
        return new int[]{};
    }
}
