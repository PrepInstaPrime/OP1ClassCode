// this class is an example of encapsulation 
class Help{
    private String name="OP";
    private int age= 30;
    public void intro(){
        System.out.println("My name is "+name);
    }
    public void myIntro(){
        System.out.println("my name is "+name+ " and i am "+age+"years old");
    }

}
public class EncapsulationEx {
    public static void main(String[] args) {
        Help obj = new Help();
        obj.intro();
        obj.myIntro();
    }
}
