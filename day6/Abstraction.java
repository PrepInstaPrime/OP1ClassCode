abstract class  VerifyPayment{
    // abstract method
        abstract void validateCard();
    // concrete methods
        public void request(){
            System.out.println("User wants to payment");
        }
    // abstract classes can also have constructor method : no return type , same name as class name 
    // it automatically executes when object is created 
    // note: abstract classes can't have object
    VerifyPayment(){
        System.out.println("hey i am constructor");
    }
}

class Child extends VerifyPayment{
    public void validateCard(){
        System.out.println("card is validated");
        request();
    }

}

public class Abstraction {
    public static void main(String[] args) {
        Child obj = new Child();
        obj.validateCard();
    }
}
