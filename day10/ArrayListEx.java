import java.util.ArrayList;
class ArrayListEx {
    public static void main(String args[]){
        ArrayList<Integer> list= new ArrayList<>();
        // add method to add value 
        list.add(4);
        list.add(5);
        list.add(3);
        System.out.println(list);
        // get value 
        // System.out.println(list.get(1));
        // update 
        list.set(1,2);
        System.out.println(list);
        list.remove(1);
        System.out.println(list.size());
        list.clear();
        System.out.println(list);

    }
}