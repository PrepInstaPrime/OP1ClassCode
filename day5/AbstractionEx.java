abstract class Father{
    public String surname="Pandey";
    // abstract methods : method defined with abstract keyword but does not have any body
    abstract void ethics();
    // concrete method : normal method
    public void intro(){
        System.out.println("I belong to repected family");
    }
}
abstract class Mother{
    abstract void kindness();
}
// note
// it does not support multiple inheritance 
// it's not strictly abstacted


// node Abstract properties or methods must be implemented in child class 
class Child1 extends Father {
    public void ethics(){
        System.out.println("Hey good morning, i am good guy");
    }
}
public class AbstractionEx {
    public static void main(String[] args) {
        Child1 obj = new Child1();
        obj.intro();
    }
}
