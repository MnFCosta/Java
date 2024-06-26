package mfc.datastructures;

public class BSTMAIN {
    public static void main(String[] args){
        BinarySearchTree tree = new BinarySearchTree();

        tree.insert(new BTNODE(5));
        tree.insert(new BTNODE(9));
        tree.insert(new BTNODE(3));
        tree.insert(new BTNODE(6));
        tree.insert(new BTNODE(1));
        tree.insert(new BTNODE(8));
        tree.insert(new BTNODE(2));
        tree.insert(new BTNODE(10));

        tree.display();
        System.out.println(tree.search(10));
        tree.remove(1);
        tree.display();
    }
}
