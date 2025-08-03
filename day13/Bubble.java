import java.util.*;
public class Bubble {
    static void bubble(int nums[]){
        for(int i=0;i<nums.length-1;i++){
            for(int j=0;j<nums.length-1-i;j++){
                if(nums[j]>nums[j+1]){
                    int temp= nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=temp;
                }
            }
        }
    }
    public static void main(String args[]){
        int arr[]={5,4,3,2,1};
        System.out.println("Original Array: "+Arrays.toString(arr));
        bubble(arr);
        System.out.println("Sorted Array: "+Arrays.toString(arr));
    }
}