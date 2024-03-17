class Node{
    int data;
    int height;
    Node left;
    Node right;

    Node(int key){
        this.data = key;
        height = 1;
    }
}



public class AVL_tree {
    Node root;

    int height(Node n){
        if (n==null){
            return 0;
        }
        return n.height;
    }

    Node leftRotate(Node x){
        Node y = x.right;
        Node T2 = y.left;

        y.left=x;
        x.right=T2;

        y.height = 1+ Math.max(height(y.left), height(y.right));
        x.height = 1+Math.max(height(x.left),height(x.right));

        return y;
    }

    Node rightRotate(Node y){
        Node x = y.left;
        Node T2 = x.right;

        x.right=y;
        y.left=T2;

        y.height = 1+ Math.max(height(y.left), height(y.right));
        x.height = 1+Math.max(height(x.left),height(x.right));

        return x;
    }

    int getBalance(Node root){
        if (root==null){
            return 0;
        }
        return height(root.left)-height(root.right);
    }

    Node insert(Node root , int key){
        // normal bst insertion
        if (root==null){
            return(new Node(key));
        }
        if(key<root.data){
            root.left = insert(root.left,key);
        }
        else{
            if(key>root.data){
                root.right = insert(root.right,key);
            }
            else{
                return root;
            }
        }

        root.height = 1 + Math.max(height(root.left),height(root.right)); 

        // check balance
        int balance = getBalance(root);

        if (balance>1 && key<root.left.data){
            return rightRotate(root);
        }
        if (balance<-1 && key>root.right.data){
            return leftRotate(root);
        }
        if (balance<-1 && key>root.right.data){
            root.right = rightRotate(root.right);
            return leftRotate(root);
        }
        if (balance>1 && key>root.left.data){
            root.left = leftRotate(root.left);
            return rightRotate(root);
        }

        return root;
    }

    void preorder(Node root){
        if (root!=null){
            System.out.println(root.data + " ");
            preorder(root.left);
            preorder(root.right);
        }
    }

    public static void main(String[] args) {
        AVL_tree at = new AVL_tree();
        at.root = at.insert(at.root, 10);
        at.root = at.insert(at.root, 20);
        at.root = at.insert(at.root, 30);
        at.root = at.insert(at.root, 40);
        at.root = at.insert(at.root, 50);
        at.root = at.insert(at.root, 25);
        at.preorder(at.root);
    }
}
