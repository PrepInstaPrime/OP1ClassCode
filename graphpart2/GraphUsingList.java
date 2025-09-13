import java.util.ArrayList;

class DUG{
    int virtices;
    ArrayList<ArrayList<Integer>> graphList;
    public DUG(int v){
        this.virtices=v;
        graphList= new ArrayList<>();
        for(int i=0;i<=v;i++){
            graphList.add(new ArrayList<>());
        }
    }
    public void insert(int src, int dest){
        graphList.get(src).add(dest);
    }
    public void read(){
        for(int i=1;i<=virtices;i++){
            System.out.print(i+"->[");
            for(int node:graphList.get(i)){
                System.out.print(node+" ");
            }
            System.out.println("]");
        }
        System.out.println();
    }
    public int delete(int src, int dest){
        int idx=graphList.get(src).indexOf(dest);
        if(idx==-1){
            System.out.println("data not found");
            return -1;
        }
        return graphList.get(src).remove(idx);
    }
}
public class GraphUsingList {

    public static void main(String[] args) {
        DUG graph= new DUG(5);
        graph.insert(1, 2);
        graph.insert(1, 4);
        graph.insert(2, 3);
        graph.insert(2, 5);
        graph.insert(3, 5);
        graph.insert(4, 5);
        graph.read();
        graph.delete(2, 3);
        graph.read();

    }
}
