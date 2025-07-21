/*
 * we use this algorithm when data is sorted and we are searching something or trying to get pair in most of the cases. 
 */
// example: Two sum : find the pair of the elements whoose sum is equal to target and array is sorted. 

import java.util.Arrays;
import java.util.Scanner;

public class TwoPointer {
    public static int [] pair(int arr[], int target){
        /* 
           int res[]= new int[2]; // [0,0]
            // brute force : TC: O(n2), SC: O(1)
            for( int i=0;i<arr.length;i++){
                for(int j=i+1;j<arr.length;j++){
                    int sum= arr[i]+arr[j];
                    if(sum==target){
                        res[0]=arr[i];
                        res[1]=arr[j];
                        return res;
                    }
                }
            }
            return res;
        */
        // two pointer

        int left=0;
        int right= arr.length-1;
        while(left<right){
            int sum=arr[left]+arr[right];
            if(sum==target){
                return new int[]{arr[left],arr[right]};
            }else if(sum<target){
                left++;
            }else{
                right--;
            }
        }
        return new int[]{0,0};
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6};
        int target= 11;
        System.out.println(Arrays.toString(pair(arr, target)));
    }
}
