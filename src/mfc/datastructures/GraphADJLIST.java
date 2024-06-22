package mfc.datastructures;

import java.util.ArrayList;
import java.util.LinkedList;

public class GraphADJLIST {
    ArrayList<LinkedList<Node>> alist;

    GraphADJLIST(){
        alist = new ArrayList<>();
    }

    public void addNode(Node node){
        LinkedList<Node> newList = new LinkedList<>();
        newList.offer(node);
        alist.add(newList);
    }

    public void addEdge(int source, int dst){
        LinkedList<Node> currentList = alist.get(source);
        Node dstNode = alist.get(dst).get(0);
        currentList.addLast(dstNode);
    }

    public boolean checkEdge(int source, int dst){
        Node dstNode = alist.get(dst).get(0);
        for (Node node: alist.get(source)){
            if (node == dstNode){
                return true;
            }
        }
        return false;
    }

    public void print(){
        for (LinkedList<Node> list: alist){
            for (Node node: list){
                System.out.print(node.data + "->");
            }
            System.out.print('\n');
        }
        System.out.print("\n");
    }
}
