
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Graphs {

    // Method to add an edge between two vertices
    public static void addEdge(List<List<Integer>> adj, int i, int j) {
        adj.get(i).add(j);
        adj.get(j).add(i); // Undirected
    }

    // Method to display the adjacency list
    public static void displayAdjList(List<List<Integer>> adj) {
        for (int i = 0; i < adj.size(); i++) {
            System.out.print(i + ": "); // Print the vertex
            for (int j : adj.get(i)) {
                System.out.print(j + " "); // Print its adjacent 
            }
            System.out.println();
        }
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Create a graph with 4 vertices and no edges
        int V = sc.nextInt();
        List<List<Integer>> adj = new ArrayList<>(V);
        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }

        // Now add edges one by one
        for (int i = 0; i < V; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            addEdge(adj, x, y);
        }
        System.out.println("Adjacency List Representation:");
        displayAdjList(adj);
    }
}
