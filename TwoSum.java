//Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

//You may assume that each input would have exactly one solution, and you may not use the same element twice.

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] indices = new int[2];
        int arSize = nums.length;
        //starting indices
        int x = 0;
        int y = 1;
        
        boolean done = false;
        //Iterate until solution is found (we're assuming there is a solution)
        while(!done){
            if((nums[x] + nums[y]) == target){
                done = true;
                indices[0] = x;
                indices[1] = y;
            }
            else{
                if(y == arSize - 1){
                    x++;
                    y = 0;
                }
                else if ((y + 1) == x){
                    y = y + 2;
                }
                else{
                    y++;
                }
            }
        }
        
        return indices;
    }
}
