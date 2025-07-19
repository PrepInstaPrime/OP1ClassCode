public class ControlFlow {
    public static void main(String[] args) {
        int a = 5; 
        int b= 6; 
        int c= 7; 
        // conditionals 
        if(a>b && a>c){
            System.out.println(" a is greater");
        }else if(b>a&&b>c) {
            System.out.println(" b is greater");
        }else {
            System.out.println(" c is greater");
        }
        // switch case // choices 
        String str = "Orange";
        switch (str) {
            case "Apple": System.out.println("Apple : 150 ");
            break;
            case "Mango": System.out.println("Mango: 100");
            break;
            default:System.out.println(" please enter the correct choice");
        }

    }
}
