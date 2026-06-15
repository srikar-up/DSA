class Solution {
    public void moveZeroes(int[] nums) {
          int p1=0;
          
          int n = nums.length;
          for(int i=0;i<n;i++){
            if(nums[i]!=0){
                int t = nums[i];
                nums[i] = nums[p1];
                nums[p1] = t;
                p1++;
          }

               
         }
    }
}
        

