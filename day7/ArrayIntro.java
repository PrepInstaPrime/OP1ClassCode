import java.util.Arrays;
import java.util.Scanner;

public class ArrayIntro {
    public static void main(String[] args) {
        // array basic
        /* 
        // integer array
        // way 1
        int arr[]={2,1,3,4};
        System.out.println(arr);
        // we can't directly print array , we have to convert array into string
        // with the help of Arrays.toString()
        System.out.println(Arrays.toString(arr));

        // defining an array with size
        // second way of creating an array
        int arr1[]= new int[5];
        System.out.println(Arrays.toString(arr1));

        // update the array 
        arr1[0]=7;
        arr1[1]=9;
        arr1[2]=10;
        System.out.println(Arrays.toString(arr1));
        */

        // practice 1
        /* 
        // take n size array and put some values then print the sum of the values of the array
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n= sc.nextInt();
        int arr2[]= new int[n];
        for(int i=0;i<n;i++ ){
            System.out.print("Enter the "+i+ " index value : ");
            arr2[i]=sc.nextInt();
        }
        sc.close();
        System.out.println("Your array "+Arrays.toString(arr2));
        int sum=0;
        for(int i=0;i<arr2.length;i++){
            sum+=arr2[i];
        }
        System.out.println("Array sum :"+ sum);
        */

        // practice 2
        // create a character array where u store n characters 
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the size of the array : "); 
        int m=sc.nextInt();
        char arr3[]=new char[m];
        // System.out.println(Arrays.toString(arr3));
        for(int i=0;i<m;i++){
            System.out.print("Inter value for index "+i+" :");
            arr3[i]=sc.next().charAt(0);
        }
        System.out.println(Arrays.toString(arr3));



    }
}
