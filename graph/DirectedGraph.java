public class DirectedGraph {
    int vertics;
    int graph[][];
    public DirectedGraph(int vertics){
        this.vertics= vertics;
        graph = new int[vertics+1][vertics+1];
    }
    public void insert(int src, int dest){
        graph[src][dest]=1;
    }
    public void display(){
        for(int i=0;i<=vertics;i++){
            for(int j=0;j<=vertics;j++){
                if(graph[i][j]==1){
                    System.out.println(i+"->"+j);
                }
            }
        }
    }
    public String delete(int src, int dest){
        graph[src][dest]=0;
        return src+"->"+dest;
    }
    public static void main(String[] args) {
        DirectedGraph DG= new DirectedGraph(3);
        DG.insert(1, 2);
        DG.insert(2, 3);
        DG.insert(3, 1);
        DG.insert(1,3 );
        DG.display();
        System.out.println("deleted route "+DG.delete(2, 3));
        DG.display();
    }
}
