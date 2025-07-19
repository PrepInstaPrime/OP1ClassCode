class Parent {
    private String name = "Vinayak";
    private String sub = "DSA";
    // getter method
    public String[] intro() {
        return new String[] { name, sub };
    }
}

public class EncapsulationEx {
    public static void main(String[] args) {
        Parent obj = new Parent();
        String res[] = obj.intro();
        for (int i = 0; i < res.length; i++) {
            System.out.println(res[i]);
        }
    }
}
