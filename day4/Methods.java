public class Methods {
    public static void add(int a,int b){
        System.out.println("sum: "+(a+b));
    }
    public static int multiplication(int a, int b){
        return a*b;
        // if method returned something then it will not execute further code 
        // System.out.println("hello");
    }
    public static void main(String[] args) {
        // not storing anywhere
        add(4, 5);
        // add(6, 7);
        // int sum= add(5, 7);  // add(5,7) // error
        int mul= multiplication(5, 2);
        System.out.println(mul-5);

    }
}
