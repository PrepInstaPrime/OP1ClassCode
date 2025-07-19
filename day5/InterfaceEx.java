// interfaces are rules or contract which child class must need to follow
interface Father {
    // in interface methods and properties are by default abstract
    void ethics();
    // after java 8 we can have concrete methods also with the helo of default keyword
    // concrete method
    public default void intro(){
        System.out.println("hey i am from respected family");
    }
}

interface  Mother {
    void kindness();
}
// for inheritance we need to use implements keyword
class Child2 implements Father, Mother{
    public void ethics (){
        System.out.println(" Hey good morning , i am good guy");
    }
    public void kindness(){
        System.out.println("I am always here to help");
    }
}
public class InterfaceEx {
    public static void main(String[] args) {
        Child2 obj = new Child2();
        obj.intro();
    }
}
