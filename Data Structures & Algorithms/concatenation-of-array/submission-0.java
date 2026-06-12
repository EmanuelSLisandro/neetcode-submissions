class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] arrayDuplicada = new int[nums.length * 2];
        for(int i = 0; i < nums.length; i++){
            arrayDuplicada[i] = nums[i];
            arrayDuplicada[i + nums.length] = nums[i]; 
        }
        return arrayDuplicada;
    }
}