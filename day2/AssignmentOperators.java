public class AssignmentOperators {
    public static void main(String[] args) {
        int a=5;
        int b=a;
        b+=a; // b= b+a;  // b=5+5   //10
        System.out.println(b);
        b/=a;  // b=b/a;  // b=10/5   //2  
        System.out.println(b);
        b%=a;  // b=b%a;  // b= 2%5   // 2
        System.out.println(b);
    }
}
