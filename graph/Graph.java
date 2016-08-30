package graph;

import java.util.LinkedList;

/**
 * Created by vinit on 8/30/16.
 */
public class Graph {
    private int V;
    private LinkedList<Integer> adjacencyList[];


    Graph(int v) {
        V = v;
        for (int i = 0; i < V; i++) {

            adjacencyList[i] = new LinkedList();
        }

    }

    void addEdge(int v, int w) {
        adjacencyList[v].add(w);
    }


}
