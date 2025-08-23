// write the program to reverse the string using stack

import java.util.Stack;

public class ReverseString {
    public static void main(String[] args) {
        String str="Hello";
        Stack<Character> st= new Stack<>();
        for(char c:str.toCharArray()){
            st.push(c);
        }
        String res="";
        while(!st.isEmpty()){
            res+=st.pop();
        }
        System.out.println(res);
    }
}
