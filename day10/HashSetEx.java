import java.util.HashSet;
class HashSetEx {
    public static void main(String args[]){
        HashSet<Integer> set = new HashSet<>();
        set.add(2);
        set.add(1);
        set.add(2);
        set.add(4);
        set.add(3);
        System.out.println(set);
        // you can not use get method to access the value
        // or can't access value using indexes
        System.out.println(set.size());
        set.remove(2);  // remove for the element
        System.out.println(set);
        System.out.println(set.contains(2));


        // iterate over hashset : for Each
        for(int val:set){
            System.out.println(val);
        }

    }
}