class Solution {
    public void sortColors(int[] nums) {
        int n= nums.length;
        int xor0 = 0;
        int xor1 = 1;
        int xor2 = 2;
        int count0 = 0;
        int count1 = 0;
        int count2 = 0;
        for(int i=0;i<n;i++){
            if((xor0 ^ nums[i]) == 0) count0++;
            else if((xor1 ^ nums[i]) == 0) count1++;
            else if((xor2 ^ nums[i]) == 0) count2++;
        }
        int j;
        for(j=0;j<count0;j++){
            nums[j] = 0;
        }
        while(j<count0+count1){
            nums[j] = 1;
            j++;
        }
        while(j<count0+count1+count2){
            nums[j] = 2;
            j++;
        }
    }
}