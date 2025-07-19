public class BitwiseOperators {
    public static void main(String[] args) {
        // these operators works on bits 
        int a=5;
        int b=2;
        System.out.println("And: "+(a&b));
        System.out.println("OR: "+(a|b));
        System.out.println("NOT: "+ (~b));  // come back tomorrow 
        // 0000000000...0 10
        // 0000000000...001

        System.out.println(a^b);  // XOR

    }
}
