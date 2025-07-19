public class ForLoopExample {
    public static void main(String[] args) {
        // print first 10 natural numbers 
        // for(initializer ; condition ; increment/decrement)
        for(int i=1;i<=10;i++){
            System.out.println(i);
        }
        // print even numbers 
        System.out.println("print even");
        for(int i=1;i<=10;i++){
            if(i%2==0){
                System.out.println(i);
            }
        }


        
    }
}
