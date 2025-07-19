import day4.AccessModifierEx;
// class name must follow th pascal case : i.g : HelloWorld
public class ClassAndObject {
    // method names follow lower camel case
    static void helloWorld(){
        System.out.println("hey this is Operation placement");
    }
    // if no access modifier then it's default
    void method1(){
        System.out.println("this is method 1");
    }
    public static void main(String[] args) {
        // creating obj
        // ClassAndObject obj= new ClassAndObject();
        // helloWorld();
        // non static methods or properties can't invoke or accessed without object
        // obj.method1();
        AccessModifierEx obj1= new AccessModifierEx();
        obj1.method1();
        // obj1.method2(); // can't access outside class
        obj1.method3(); // can't access outside 
        obj1.method4();
    }
}
