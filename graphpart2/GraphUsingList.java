import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

class DWG{
    int virtices;
    ArrayList<ArrayList<Integer>> graphList;
    public DWG(int v){
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
    public void BFS(int start){
        boolean visited[]= new boolean[virtices+1];
        Queue<Integer> q= new LinkedList<>();
        visited[start]=true;
        q.offer(start);
        while (!q.isEmpty()) {
            int node= q.poll();
            System.out.print(node+" ");
            for(int next:graphList.get(node)){
                if(!visited[next]){
                    visited[next]=true;
                    q.offer(next);
                }
            }
        }
        System.out.println();
    }
    public void DFS(int start){
        boolean visited[]= new boolean[virtices+1];
        helperDfs(start, visited);

    }
    public void helperDfs(int start, boolean []visited){
         visited[start]=true;
         for(int next:graphList.get(start)){
            if(!visited[next]){
                 helperDfs(next, visited);
            }
         }
        System.out.print(start+" ");
    }
}
public class GraphUsingList {

    public static void main(String[] args) {
        /* 
        DWG graph= new DWG(7);
        graph.insert(1, 2);
        graph.insert(1, 3);
        graph.insert(2, 4);
        graph.insert(2, 5);
        graph.insert(2, 6);
        graph.insert(3, 6);
        graph.insert(3, 7);
        graph.insert(6, 5);
        graph.insert(5, 4);
        graph.insert(7, 7);

        // graph.read();
        // graph.delete(2, 3);
        // graph.read();
        // graph.BFS(3);
        */
        DWG graph = new DWG(4);
        graph.insert(1, 2);
        graph.insert(2, 3);
        graph.insert(3, 4);
        graph.DFS(1);

    }
}
