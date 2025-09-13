class WGM{
    int virtices;
    int graph[][];
    public WGM(int v){
        this.virtices=v;
        graph= new int[v+1][v+1];
    }    
    public void insert(int src, int dest, int weight){
        graph[src][dest]=weight;
    }
    public void read(){
        for(int i=1;i<=virtices;i++){
            for(int j=1;j<=virtices;j++){
                if(graph[i][j]!=0){
                    System.out.println(i+"->"+j +" weight: "+graph[i][j]);
                }
            }
        }
    }
}
public class WeightedGraphMatrix {
   public static void main(String[] args) {
      WGM graph= new WGM(5);
      graph.insert(1,2,5);
      graph.insert(2, 3, 2);
      graph.insert(3, 4, 6);
      graph.insert(1, 4, 2);
      graph.insert(2, 5, 3);
      graph.insert(3, 5, 2);
      graph.read();
   }
}
