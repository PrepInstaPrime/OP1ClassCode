import java.util.Arrays;

public class MultidimensionalArr {
    public static void main(String[] args) {
        // 2D array
        int arr1[][]={{1,2,3,5},{3,4}};
        // print 3 
        System.out.println(arr1[1][0]);
        for(int i=0;i<arr1.length;i++){
            System.out.print(Arrays.toString(arr1[i]));
        }
        // defining 2D array with size
        System.out.println();
        int arr2[][]= new int[7][3];
        for(int i=0;i<arr2.length;i++){
            System.out.print(Arrays.toString(arr2[i]));
        }

        // 3D array
        int arr3[][][]= {{{1,2},{3,4}},{{5,6},{6,7}},{{8,9},{10,11}}};
        System.out.println();
        // print 9
        System.out.println(arr3[2][0][1]);

        int arr4[][][]=new int[4][2][3];
        for(int i=0;i<arr4.length;i++){
            for(int j=0;j<arr4[i].length;j++){
                // entire array 
                System.out.print(Arrays.toString(arr4[i][j]));
                // for(int k=0;k<arr4[i][j].length;k++){
                // access the individual values
                //     System.out.println(arr4[i][j][k]);
                // }
            }
        }
        
    }
}
