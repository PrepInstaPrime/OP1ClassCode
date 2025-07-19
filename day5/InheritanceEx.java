class Parent{
    public int money=10000;
    private String car ="Honda City";
    protected String home= "OP";
    public void status(){
        System.out.println("My Parent networth "+money + "and their car "+car);
    }
    // getter and setter are the functions which used to access and update private properties. 
    // getter function for accessing private properties 
    public String myCar(){
        return car;
    }
    // setter function for updating the car name
    public void updateCar(String newCar){
            car=newCar;
    }
}
class Child extends Parent{
    // all the property of parent is now accessible in child
    public int childMoney=5000;
    // public void updateCar(String newCar) {
    //     super.updateCar(newCar);
    // }
    public void childStatus(){
        System.out.println("My networth "+ (childMoney+money));
        //System.out.println(car);  // error
        System.out.println(myCar());
        System.out.println(home);
    }
    
}
public class InheritanceEx {
    public static void main(String[] args) {
        Child obj = new Child();
        obj.childStatus();
        obj.updateCar("BMW");
        obj.status();
    }
}
