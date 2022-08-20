/*
  Maximum Product Subarray
  Runtime : O(n)
  Space : O(1)
*/
public int maxProduct(int[] nums) {
       int max = Integer.MIN_VALUE;
        int prodLeft = 1;
        int prodRight = 1;
        int n = nums.length;
        for(int i = 0; i < n; i++){
            prodLeft *= nums[i];
            prodRight *= nums[n - i - 1];
            if(max < prodLeft || max < prodRight){
                max = Math.max(prodLeft, prodRight);  
            }
            if(nums[i] == 0)
                prodLeft = 1;
            if(nums[n - i - 1] == 0)
                prodRight = 1;
            
        }
        return max;
 }
