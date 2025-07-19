

public class ExceptionHandling {
   public static void main(String[] args) throws ArithmeticException {
      try {
        int a=9;
        int arr[]={1,2,3};
        int age=19;
        if(age<18){
            throw new Error("You are not eligible for vote");
        }
        System.out.println(a/2);
        System.out.println(arr[4]);
      } catch (ArithmeticException e) {
        System.out.println("Arithmetic Exception"+e.getMessage());
      }catch(Exception e){
        System.out.println("Other Exceptions: "+e.getMessage());
      }
      finally{
        System.out.println("hey i will run always");
      }
    // System.out.println(9/0);
   }
}
