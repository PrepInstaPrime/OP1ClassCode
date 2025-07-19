package day4;
public class AccessModifierEx {
    // everywhere accessisble 
    public void method1(){
        System.out.println("hey i am public");
    }
    // can't accessed outside class
    private void method2(){
        System.out.println("hey i am private");
    }
    // can't access outside package or without subclass
    protected void method3(){
        System.out.println("hey i am protected");
    }
    // can't access outside the package
    void method4(){
        System.out.println("hey i am default");
    }

}
