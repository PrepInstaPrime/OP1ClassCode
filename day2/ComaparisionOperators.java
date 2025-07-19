public class ComaparisionOperators {
    public static void main(String[] args) {
        // they always gives boolean values 
        int a=5;
        int b=6;
        int c=6;
        char d= 'e';
        System.out.println(a==b);  // false
        System.out.println(a>b);  // false 
        System.out.println(a<b); // true
        System.out.println(b<=c);  // true
        System.out.println(d=='e');  // true
        // System.out.println(d=="e"); // error
        String str1= "hello";
        String str2= new String("hello");
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str1.equals(str2)); // true
    }
}
