import java.util.*;
public class Problem1 {
    static char maxChar(String str){
        HashMap<Character, Integer> map= new HashMap<>();
        for(int i=0;i<str.length();i++){
            if(map.containsKey(str.charAt(i))){
                map.put(str.charAt(i),map.get(str.charAt(i))+1);
            }else{
                map.put(str.charAt(i),1);
            }
        }
        int max=0;
        char maxC=str.charAt(0);
        for(char key:map.keySet()){
            if(map.get(key)>max){
                max=map.get(key);
                maxC=key;
            }
        }
        System.out.println(map);
        return maxC;
    }
    public static void main(String args[]){
        String str="abcabttttcdeaaabcdrgughjgidaqrttttttttaaaaiiieee";
        char max= maxChar(str);
        System.out.println(max);
    }
}