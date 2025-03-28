package BFS;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;
import java.util.Set;
import java.util.Stack;



class Graph {
	private List<String> nodes;
	private int[][] adjMatrix;

	public Graph(List<String> nodes) {
		this.nodes = nodes;
		this.adjMatrix = new int[nodes.size()][nodes.size()];
	}

	public void addEdge(String u, String v) {
		int i = nodes.indexOf(u);
		int j = nodes.indexOf(v);
		adjMatrix[i][j] = 1;
		adjMatrix[j][i] = 1;
	}

	public void bfs(String start) {
		Set<String> visited = new HashSet<>();
		Queue<String> queue = new LinkedList<>();
		List<String> traversalOrder = new ArrayList<>();
		queue.add(start);
		System.out.println("\nBFS Traversal:");
		while (!queue.isEmpty()) {
			String node = queue.poll();
			if (!visited.contains(node)) {
				visited.add(node);
				traversalOrder.add(node);
				int index = nodes.indexOf(node);
				for (int i = 0; i < nodes.size(); i++) {
					String neighbor = nodes.get(i);
					if (adjMatrix[index][i] == 1 && !visited.contains(neighbor) && !queue.contains(neighbor)) {
						queue.add(neighbor);
					}
				}
				System.out.println("Visited: " + node + ", Queue: " + new ArrayList<>(queue));
			}
		}
		System.out.println("Final BFS Traversal Order: " + traversalOrder);
	}

	public void dfs(String start) {
		Set<String> visited = new HashSet<>();
		Stack<String> stack = new Stack<>();
		List<String> traversalOrder = new ArrayList<>();
		stack.push(start);
		System.out.println("\nDFS Traversal:");
		while (!stack.isEmpty()) {
			String node = stack.pop();
			if (!visited.contains(node)) {
				visited.add(node);
				traversalOrder.add(node);
				int index = nodes.indexOf(node);
				for (int i = nodes.size() - 1; i >= 0; i--) {
					String neighbor = nodes.get(i);
					if (adjMatrix[index][i] == 1 && !visited.contains(neighbor) && !stack.contains(neighbor)) {
						stack.push(neighbor);
					}
				}
				System.out.println("Visited: " + node + ", Stack: " + new ArrayList<>(stack));
			}
		}
		System.out.println("Final DFS Traversal Order: " + traversalOrder);
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter number of nodes: ");
		int numNodes = scanner.nextInt();
		scanner.nextLine();
		System.out.print("Enter node names (space-separated): ");
		List<String> nodes = Arrays.asList(scanner.nextLine().split(" "));
		Graph g = new Graph(nodes);
		System.out.println("Enter adjacency matrix (row by row):");
		for (int i = 0; i < numNodes; i++) {
			String[] row = scanner.nextLine().split(" ");
			for (int j = 0; j < numNodes; j++) {
				if (row[j].equals("1")) {
					g.addEdge(nodes.get(i), nodes.get(j));
				}
			}
		}
		System.out.print("Enter start node for BFS and DFS: ");
		String startNode = scanner.nextLine();
		g.bfs(startNode);
		g.dfs(startNode);
		scanner.close();
	}
}