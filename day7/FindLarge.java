// write a java program to find the largest number in the array
import java.util.Scanner;
public class FindLarge {
    public static int largeFind(int [] arr ){
        int max= arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n= sc.nextInt();
        int arr[]= new int[n];

        for(int i=0;i<arr.length;i++){
            System.out.print("Enter the value of index "+i+" :");
            arr[i]=sc.nextInt();
        }
        System.out.println("Result: "+largeFind(arr));

    }
}
