package mfc.datastructures;

public class DFS {
    public static void main(String[] args){
        Graph graph = new Graph(5);

        graph.addNode(new Node('A'));
        graph.addNode(new Node('B'));
        graph.addNode(new Node('C'));
        graph.addNode(new Node('D'));
        graph.addNode(new Node('E'));

        graph.addEdge(0,1);
        graph.addEdge(1,2);


        graph.print();

        graph.depthFirstSearch(0);
    }
}
