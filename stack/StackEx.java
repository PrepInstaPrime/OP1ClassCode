import java.util.Stack;
public class StackEx {
    public static void main(String[] args) {
        Stack<Integer> st= new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        System.out.println(st);
        int val= st.pop();
        System.out.println(val);
        int peek= st.peek();
        System.out.println(peek);
        boolean checkEmpty= st.isEmpty();
        System.out.println(checkEmpty);
        System.out.println(st.size());
    }
}
