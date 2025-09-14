import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.PriorityQueue;
class Pair {
    int node;
    int weight;

    public Pair(int node, int weight) {
        this.node = node;
        this.weight = weight;
    }
}

class WDG {
    int virtices;
    ArrayList<ArrayList<Pair>> graphList;

    public WDG(int v) {
        this.virtices = v;
        this.graphList = new ArrayList<>();
        for (int i = 0; i <= v; i++) {
            graphList.add(new ArrayList<>());
        }
    }

    public void insert(int src, int dest, int weight) {
        graphList.get(src).add(new Pair(dest, weight));
        // undirected graph
        // graphList.get(dest).add(new Pair(src, weight));
    }

    public void read() {
        for (int i = 1; i <= virtices; i++) {
            System.out.print(i + "->");
            for (Pair p : graphList.get(i)) {
                System.out.print("[" + p.node + "," + p.weight + "]");
            }
            System.out.println();
        }
    }

    public void BFS(int start) {
        boolean visited[] = new boolean[virtices + 1];
        Queue<Integer> q = new LinkedList<>();
        visited[start] = true;
        q.offer(start);
        while (!q.isEmpty()) {
            int v = q.poll();
            System.out.print(v + " ");
            for (Pair p : graphList.get(v)) {
                if (!visited[p.node]) {
                    visited[p.node] = true;
                    q.offer(p.node);
                }
            }
        }
        System.out.println();
    }

    public void DFS(int start) {
        boolean visited[] = new boolean[virtices + 1];
        helperDfs(start, visited);
    }

    public void helperDfs(int start, boolean[] visited) {
        visited[start] = true;
        // preorder traversal
        // System.out.print(start+"->");
        for (Pair p : graphList.get(start)) {
            if (!visited[p.node]) {
                helperDfs(p.node, visited);
            }
        }
        // post order traversal
        System.out.print(start + "->");
    }

    // Directed cycle detection
public boolean hasCycleDirected() {
    boolean[] visited = new boolean[virtices + 1];
    boolean[] recStack = new boolean[virtices + 1];

    for (int i = 1; i <= virtices; i++) {
        if (!visited[i]) {
            if (dfsCycleDirected(i, visited, recStack)) {
                return true;
            }
        }
    }
    return false;
}

private boolean dfsCycleDirected(int node, boolean[] visited, boolean[] recStack) {
    visited[node] = true;
    recStack[node] = true;

    for (Pair p : graphList.get(node)) {
        int neigh = p.node;
        if (!visited[neigh]) {
            if (dfsCycleDirected(neigh, visited, recStack)) {
                return true;
            }
        } else if (recStack[neigh]) {
            // visited and still in recursion stack -> cycle
            return true;
        }
    }

    // remove from recursion stack before returning
    recStack[node] = false;
    return false;
}
// inside WDG class
public int[] dijkstra(int src) {
    int[] dist = new int[virtices + 1];
    boolean[] visited = new boolean[virtices + 1];

    // initialize distances to infinity
    for (int i = 1; i <= virtices; i++) {
        dist[i] = Integer.MAX_VALUE;
    }
    dist[src] = 0;

    // min-heap by distance
    PriorityQueue<Pair> pq = new PriorityQueue<>((a, b) -> a.weight - b.weight);
    pq.add(new Pair(src, 0));

    while (!pq.isEmpty()) {
        Pair current = pq.poll();
        int u = current.node;

        if (visited[u]) continue;
        visited[u] = true;

        for (Pair edge : graphList.get(u)) {
            int v = edge.node;
            int weight = edge.weight;

            if (dist[u] + weight < dist[v]) {
                dist[v] = dist[u] + weight;
                pq.add(new Pair(v, dist[v]));
            }
        }
    }

    return dist;
}


}

public class WeightedGraphEx {
    public static void main(String[] args) {
        WDG graph = new WDG(5);
        graph.insert(1, 2, 1);
        graph.insert(1, 5, 1);
        graph.insert(2, 3, 2);
        graph.insert(2, 5, 1);
        graph.insert(3, 4, 3);
        graph.insert(3, 5, 1);
        graph.insert(4, 5, 4);
        graph.insert(4, 1, 3);
        graph.read();
        graph.BFS(2);
        graph.DFS(3);
        System.out.println();
        System.out.println(graph.hasCycleDirected());
    }
}
