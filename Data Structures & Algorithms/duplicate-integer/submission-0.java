class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer>visto = new HashSet<>();

        for(int num : nums){
            if(visto.contains(num)){
                return true;
            }else{
                visto.add(num);
            }
        }
        return false;
    }
}