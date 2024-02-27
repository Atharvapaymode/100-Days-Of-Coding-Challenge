class Solution {
    public int countHillValley(int[] nums) {

            int HillsAndValleys = 0;
            int Start = nums[0];
        for(int i = 1; i < nums.length - 1; i++){
            if(Start < nums[i] && nums[i] > nums[i + 1] || Start > nums[i] && nums[i] < nums[i + 1]){
                HillsAndValleys++;
                Start = nums[i];
            }
        
    }

    return HillsAndValleys;
        
        
    }
}
