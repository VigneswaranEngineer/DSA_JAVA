class Node{
    int data;
    Node left;
    Node right;

    Node(int data){
        this.data = data;
    }
}

public class height_of_tree {
    
    public void balanced_tree(Node root){
        int height = Math.abs(height(root.left)-height(root.right));
        System.out.println(height);
        if(height<=1){
            System.out.println("it is a balanced binary tree");
        }
        else{
            System.out.println("it is not a balanced sub tree");
        }
        
    }
    
    public int height(Node root){
        if (root==null){
            return 0;
        }
        int lht = height(root.left);
        int rht = height(root.right);

        return 1+Math.max(lht, rht);
    }




    public static void main(String[] args) {
        Node root = new Node(5);
        root.left = new Node(3);
        root.right = new Node(2);
        root.left.left = new Node(10);
        root.left.right = new Node(9);
        root.right.right = new Node(3);
        root.right.left = new Node(2);
        height_of_tree ht = new height_of_tree();
        ht.balanced_tree(root);
        int heigh = ht.height(root);
        System.out.println("height of the tree : "+heigh);
    }
}
