// find the maximum sum of subarray with k size where array name is nums which contains positive integers 

import java.util.Arrays;

public class FixedSizeSliding {
    public static int maxSum(int []nums, int k){
        /* 
        // brute force 
        int maxSum=0;
        for(int i=0;i<nums.length-k;i++){
            int j=i;
            int cSum=0;
            // problem with brute force here is we are doing repeatitive sum
            while(j<i+k){
                cSum+=nums[j];
                j++;
            }
            maxSum= Math.max(maxSum, cSum);
        }
        return maxSum;
        */

        // Sliding window
        int maxSum=0;
        int cSum=0;
        for(int i=0;i<k;i++){
            cSum+=nums[i];
        }
        maxSum=cSum;
        for(int i=k;i<nums.length;i++){
            cSum= cSum+nums[i]-nums[i-k];  // 6 (1+2+3) + 4 - 1 (nums(3-3))
            maxSum= Math.max(maxSum, cSum);
        }
        return maxSum;

    }
    public static void main(String[] args) {
        System.out.println(arr.length);

        

        
        

        
        

        


        

        int nums[]={1,2,3,4,7,6,9,8};
        int k=3;
        System.out.println(maxSum(nums, k));
    }
}
