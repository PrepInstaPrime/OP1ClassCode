class VariableSize {
    public static int maxLen(int arr[], int target){
        int ml=0;
        int sum=0;
        int left=0;
        for(int right=0;right<arr.length;right++){
            sum+=arr[right];
            while(sum>target && left<=right){
                sum-=arr[left];
                left++;
            }
            ml= Math.max(ml, right-left+1);
        }

        return ml;
    }
    public static void main(String args[]){
        int nums[]={1,0,1,0,1,3,2,1};
        int target=3;
        System.out.println(maxLen(nums, target));
    }
}