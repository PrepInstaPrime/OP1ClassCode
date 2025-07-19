public class TypeCasting {
    public static void main(String[] args) {
        int a= 40;
        short b= 50;
        // explicit type conversion
        b= (short)a;
        System.out.println(b);
        // implicit type conversion
        a=b;
        System.out.println(a);

    }
}
