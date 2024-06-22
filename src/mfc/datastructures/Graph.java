package mfc.datastructures;

import java.util.ArrayList;

public class Graph {
    ArrayList<Node> nodes;
    int[][] matrix;

    Graph(int size){
        nodes = new ArrayList<>();
        matrix = new int[size][size];
    }

    public void addNode(Node node){
        nodes.add(node);
    }

    public void addEdge(int source, int dst){
        matrix[source][dst] = 1;
    }

    public boolean checkEdge(int source, int dst){
        if(matrix[source][dst] == 1){
            return true;
        }
        return false;
    }

    public void print(){

        System.out.print("  ");
        for(Node node: nodes){
            System.out.print(node.data + " ");
        }

        System.out.print("\n");

        for(int i = 0; i< matrix.length; i++){
            System.out.print(nodes.get(i).data + " ");
            for(int j =0; j< matrix[i].length; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.print('\n');
        }
    }

    public void depthFirstSearch(int src){
            boolean[] visited = new boolean[matrix.length];
            dFSHelper(src, visited);

    }

    private void dFSHelper(int src, boolean[] visited){
            if(visited[src]){
                return;
            }else{
                visited[src] = true;
                System.out.println("Node " + nodes.get(src).data + " visited");
            }

            for(int i = 0; i < matrix[src].length; i++){
                if(matrix[src][i] == 1){
                    dFSHelper(i, visited);
                }
            }
            return;

    }
}
