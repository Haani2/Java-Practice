import java.util.Scanner;

public class BinaryTree {
    private static class Node{
         int val;
         Node left;
         Node right;
         public Node(int val){
             this.val=val;
         }
    }
    public Node root;
    public void bt(Scanner sc){
        System.out.println("Enter the root node ");
        int r=sc.nextInt();
        root=new Node(r);
        bt(sc,root);
    }
    private void bt(Scanner sc, Node node){
        System.out.println("do you want to inset on left? true/false "+node.val );
        boolean lf=sc.nextBoolean();
        if(lf){
            System.out.println("Enter the left number of root "+ node.val);
            int left= sc.nextInt();
            node.left= new Node(left);
            bt(sc,node.left);
        }
        System.out.println("do you want to inset on right? true/false "+ node.val);
        boolean rt=sc.nextBoolean();
        if(rt){
            System.out.println("Enter the right number of root "+ node.val);
            int right= sc.nextInt();
            node.right=new Node(right);
            bt(sc,node.right);
        }
    }
    public void display(){
        display(root, " ");
    }
    private void display(Node node, String s){
        if(node== null){
            return;
        }
        System.out.println(node.val+s);
        display(node.left,s);
        display(node.right,s);
    }
    void prettyDisplay() {
        prettyDisplay(root, 0);
    }

    void prettyDisplay(Node node, int level) {
        if (node == null) {
            return;
        }
        // Print right subtree first
        prettyDisplay(node.right, level + 1);

        // Print current node
        for (int i = 0; i < level; i++) {
            System.out.print("    ");
        }
        System.out.println(node.val);

        // Print left subtree
        prettyDisplay(node.left, level + 1);
    }
}
