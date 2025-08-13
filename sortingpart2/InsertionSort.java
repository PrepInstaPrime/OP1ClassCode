import java.util.Arrays;
public class InsertionSort {
    static void insertSort(int nums[]){
        int n=nums.length;
        for(int i=1;i<n;i++){
            int key=nums[i];
            int j=i-1;
            while (j>=0&&key<nums[j]) {
                nums[j+1]=nums[j];
                j--;
            }
            nums[j+1]=key;
        }
    }
    public static void main(String[] args) {
        int arr[]={4,1,5,6,3,5,2,-9};
        System.out.println("Original Array: "+Arrays.toString(arr));
        insertSort(arr);
        System.out.println("Sorted Array: "+Arrays.toString(arr));
    }
}
