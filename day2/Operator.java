public class Operator {
 public static void main(String[] args) {
    // unary operators 
    /* 
    // 1. Increament operators 
        // a. Pre Increament // b. Post increament 
    int a =5;
    int b=6;
    System.out.println(" Post Increament: "+ (a++)); // 5
    System.out.println("new value of a "+ a); // 6
    System.out.println("Pre increament: "+ (++b)); // 7
    System.out.println("New value of b "+ b); // 7
    */
    // 2. Decreament operators 
        // a. Post decreament , b. Pre Decreament
    int c=7;
    System.out.println("Pre Decrement :"+ (--c)); //6
    System.out.println("post Decrement "+(c--)); // 6
    System.out.println("new value of c: "+ c); // 5
    int d=8;
    int res= ++c+ --d+ d++ + c++ + --d;
    //      6+7+7+6+7 // 33
    System.out.println("res: "+res);

    // binary operators 
    /*
     * 1. Arithmatic operators ( +, -, *, /, %)
     * 2. Assignment operators ( =, +=, -=, *=)
     * 3. Logical Operators (&&, ||, !)
     * 4. Comparison / relational operators (==, >, <, <=, >=, !=)
     * 5. Bit wise Operators (&, |, ~, ^, <<, >>)
     */
 }
}