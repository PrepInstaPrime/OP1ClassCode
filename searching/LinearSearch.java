
public class LinearSearch {
    static int searchValue(int arr[],int target){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={2,4,1,6,9,-5,2,6};
        int target=1;
        System.out.println(searchValue(arr, target));
    }
}
