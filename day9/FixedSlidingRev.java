class FixedSlidingRev {
    public static int  bruteForce(int arr[],int k){
        int maxSum=0;
        for(int i=0;i<arr.length-k;i++){
            int currentSum=0;
            int j=i;
            while(j<k+i){
                currentSum+=arr[j];
                j++;
            }
            maxSum= Math.max(currentSum, maxSum);
        }
        return maxSum;  
    }
    
    public static void main (String args[]){
        int nums[]={9,8,1,4,5,7,6,3,2};
        int k=3;
        System.out.println( bruteForce(nums,k));
    }
}