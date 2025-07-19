import javax.swing.text.html.HTML;

class  Help {
    // parent method
    public void multiplication(int a, int b){
        System.out.println("Mul "+(a*b));
    } 
}
public class PolymorphismEx extends Help {
    //method overloading : type of parameter or number of parameters are different
    static void sum(int a, int b){
        System.out.println("Sum: "+(a+b));
    }
    static void sum(int a, int b,int c){
        System.out.println("Sum: "+(a+b+c));
    }
    static void sum(float a, float b){
        System.out.println("Sum "+(a+b));
    }

    // child method
    // method over riding or runtime polymorphism 
    // if child and parent both are having same property or method in this case child will over ride the property of parent. 
    public void multiplication(int a, int b){
        System.out.println("Child Multiplication "+(a*b));
    }
    public static void main(String[] args) {
        sum(5,3);
        sum(5, 6, 8);
        sum((float)4.2, (float)5.3);
        PolymorphismEx obj1 = new PolymorphismEx();
        Help obj2= new Help();
        obj1.multiplication(5, 4);
        obj2.multiplication(5, 6);

    }
}
