import java.util.Arrays;
public class MergeSort {
    static void divide(int nums[],int start, int end){
        if(start>=end){
            return;
        }
        int mid=start+(end-start)/2;
        // left array
        divide(nums, start, mid);
        // right array
        divide(nums, mid+1, end);
        // merge
        conquer(nums, start, mid, end);
    }
    static void conquer(int nums[], int start, int mid, int end){
        int temp[]= new int[end-start+1];
        int i=start;
        int j=mid+1;
        int k=0;
        while(i<=mid&&j<=end){
            if(nums[i]<=nums[j]){
                temp[k]=nums[i];
                i++;
                k++;
            }else{
                temp[k]=nums[j];
                j++;
                k++;
            }
        }
        while(i<=mid){
            temp[k]=nums[i];
            i++;
            k++;
        }
        while(j<=end){
            temp[k]=nums[j];
            j++;
            k++;
        }
        int dp=start;
        for(int m=0;m<temp.length;m++){
            nums[dp]=temp[m];
            dp++;
        }
    }
    public static void main(String[] args) {
        int arr[]={4,3,2,1};
        System.out.println("Original Array: "+Arrays.toString(arr));
        divide(arr,0,arr.length-1);
        System.out.println("Sorted Array: "+Arrays.toString(arr));
    
    }
}
