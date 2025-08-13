import java.util.Arrays;
public class QuickSort {
    static void divide(int []nums, int start, int end){
        if(start>=end){
            return;
        }
        int pivotIndex=findIndex(nums, start, end);
        divide(nums, start,pivotIndex-1);
        divide(nums, pivotIndex+1, end);
    }
    static int findIndex(int nums[],int start, int end){
        int i=start-1;
        int pivot = nums[end];
        for(int j=start;j<end;j++){
            if(nums[j]<pivot){
                i++;
                swap(nums, i, j);
            }
        }
        swap(nums, i+1, end);
        return i+1;
    }
    static void swap(int nums[], int i, int j){
        int temp= nums[i];
        nums[i]= nums[j];
        nums[j]=temp;
    }
    public static void main(String[] args) {
        int arr[]={4,3,2,1};
        System.out.println("Original Array: "+Arrays.toString(arr));
        divide(arr,0,arr.length-1);
        System.out.println("Sorted Array: "+Arrays.toString(arr));
    }
}
