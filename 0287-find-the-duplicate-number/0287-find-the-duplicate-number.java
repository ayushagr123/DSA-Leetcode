class Solution {
    public int findDuplicate(int[] nums) {
        int slow = 0;
        int fast = 0;
        boolean collide = false;
        while(collide == false){
            slow = nums[slow];
            fast = nums[fast];
            fast = nums[fast];
            if(slow == fast) collide = true;
        }
        slow = 0;
        collide = false;
        while(collide == false){
            slow = nums[slow];
            fast = nums[fast];
            if(slow == fast) collide = true;
        }
        return slow;
    }
}