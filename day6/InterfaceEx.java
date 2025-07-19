interface contract{
    // interfaces can't have constructer methods
    // before java 8 we could only have abstract methods in interfaces but after java 8 we can have both : concrete and abstract method 
    // if you want to define concrete method then u have to use default keyword
    // abstract method by default 
    void checkcard();
    // concrete method with default keyword
    default void request(){
        System.out.println("doing transation");
    }

}
public class InterfaceEx implements contract{
    public void checkcard(){
        System.out.println("your card is valid");
    }
    public void sum(int a, int b){
        System.out.println(a+b);
    }
    // method overloading : changing number of parameter or type of parameters with same method name
    public void sum(int a, int b, int c){
        System.out.println(a+b+c);
    }
    public static void main(String[] args) {
        InterfaceEx obj = new InterfaceEx();
        obj.checkcard();
        obj.sum(5, 3);
    }
    
}
