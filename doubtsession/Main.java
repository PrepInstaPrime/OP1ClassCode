import java.util.Arrays;

public class Main {
    static String name="Default Name";
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        int arr[][]= {{2,4},{1,6},{3,9},{0,5}};
        Arrays.sort(arr,(a,b)->a[0]-b[0]);
        // Main obj = new Main();
        // System.out.println(obj.name);
        System.out.println(name);
    }
}