import java.util.Arrays;
public class SelectionSort {
    static void selctionSort(int nums[]){
        int n=nums.length;
        for(int i=0;i<n-1;i++){
            int smallIdx=i;
            for(int j=i+1;j<n;j++){
                if(nums[j]<nums[smallIdx]){
                    smallIdx=j;
                }
            }
            int temp= nums[i];
            nums[i]=nums[smallIdx];
            nums[smallIdx]=temp;
        }
    }
    public static void main(String[] args) {
        int arr[]={4,1,5,6,3,5,2,-9};
        System.out.println("Original Array: "+Arrays.toString(arr));
        selctionSort(arr);
        System.out.println("Sorted Array: "+Arrays.toString(arr));
    }
}
