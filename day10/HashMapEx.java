import java.util.HashMap;
class HashMapEx {
    public static void main(String args[]){
        HashMap<String , Integer> map = new HashMap<>();
        map.put("apple",5);
        map.put("mango",3);
        System.out.println(map);
        // for update also we use put method
        // getting value .get(key)
        System.out.println(map.get("apple"));
        map.remove("apple");
        // .getOrDefault(key,0);  

    }
}