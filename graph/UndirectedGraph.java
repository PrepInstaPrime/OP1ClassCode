
public class UndirectedGraph {
    int vertics;
    int graph[][];
    public UndirectedGraph(int v){
        this.vertics=v;
        graph= new int[v+1][v+1];
    }
    public void insert ( int src, int dest){
        graph[src][dest]=1;
        graph[dest][src]=1;
    }
    public void display(){
        for(int i=0;i<vertics;i++){
            for(int j=0;j<vertics;j++){
                if(graph[i][j]==1){
                    System.out.println(i+"<-->"+j);
                }
            }
        }
    }
    public static void main(String[] args) {
        UndirectedGraph UG= new UndirectedGraph(5);
        UG.insert(1,2);
        UG.insert(2, 3);
        UG.insert(3, 4);
        UG.insert(3, 5);
        UG.insert(4, 5);
        UG.insert(4, 1);
        UG.display();
    }
}
