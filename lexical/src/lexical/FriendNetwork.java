package lexical;

import java.util.*;

class Graph {
    private int V;
    private List<Integer>[] adj;

    public Graph(int V) {
        this.V = V;
        adj = new ArrayList[V + 1];
        for (int i = 0; i <= V; i++) {
            adj[i] = new ArrayList<>();
        }
    }

    public void addEdge(int v, int u) {
        adj[v].add(u);
        adj[u].add(v); // Since it's an undirected graph
    }

    public void bfs(int source, int level, int n) {
        int[] visited = new int[n + 1];
        int[] table = new int[n + 1];

        Queue<Integer> queue = new LinkedList<>();
        visited[source] = 1;
        queue.add(source);

        while (!queue.isEmpty()) {
            int v = queue.poll();
            for (int neighbor : adj[v]) {
                if (visited[neighbor] == 0) {
                    visited[neighbor] = 1;
                    queue.add(neighbor);
                    table[neighbor] = table[v] + 1;
                }
            }
        }

        boolean found = false;
        for (int i = 1; i <= n; i++) {
            if (table[i] == level) {
                System.out.print(i + " ");
                found = true;
            }
        }
        if (!found) {
            System.out.print(0);
        }
        System.out.println();
    }
}

public class FriendNetwork {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Dummy data
        int V = 6; // Number of users
        Graph g = new Graph(V);

        int[][] edges = {
            {1, 2}, {1, 3}, {2, 4}, {3, 6}, {4, 5}
        };

        for (int[] edge : edges) {
            g.addEdge(edge[0], edge[1]);
        }

        int source = 1, level = 2; // Find friends at level 2 from user 1
        g.bfs(source, level, V);

        sc.close();
    }
}
