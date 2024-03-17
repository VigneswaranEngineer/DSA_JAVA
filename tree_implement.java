
import java.util.Stack;

class Node{
    int data;
    Node right;
    Node left;

    Node(int data){
        this.data = data;
    }
}

public class tree_implement {
    
    Node root;
    int height =0;

    public void insert(int data){
        root = insertRec(root , data);
    }

    

    public Node insertRec(Node root , int data){
        if (root == null){
            root = new Node(data);
        }
        else{
            if (data < root.data){
                root.left = insertRec(root.left, data);
            }
            else{
                root.right= insertRec(root.right, data);
            }
        }
        return root;
    }

    public void inorder(){
        inorderRec(root);
    }

    public void preorder(){
        preorderRec(root);
    }

    public void postorder(){
        postorderRec(root);
    }

    public void inorderIteration(){
        
        Stack<Node> stack = new Stack<>();
        Node node = root;
        while(true){
            if (node!=null){
                stack.add(node);
                node = node.left;
            }
            else{
                if (stack.isEmpty()){
                    break;
                }
                Node temp = stack.pop();
                System.out.print(temp.data + " ");
                node = temp.right;
            }
        }
    }

    public Node delete(int data){
        if (root==null){
            return null;
        }
        if (root.data == data){
            return helper(root);
        }
        Node dummy = root; 
        while(root!=null){
            if (root.data > data){
                if(root.left !=null && root.left.data == data){
                    root.left = helper(root.left);
                    break;
                }
                else{
                    root = root.left;
                }
            }
            else{
                if(root.right !=null && root.right.data == data){
                    root.right = helper(root.right);
                    break;
                }
                else{
                    root = root.right;
                }
            }

        }
        return dummy;
    }

    public Node helper(Node root){
        if (root.left==null){
            return root.right;
        }
        if(root.right==null){
            return root.left;
        }
        else{
            Node rightChild = root.right;
            Node lastRight = findLastRight(root.left);
            lastRight.right = rightChild;
            return root.left;
        }
    }

    public Node findLastRight(Node root){
        if (root.right == null){
            return root;
        }
        return findLastRight(root.right);
    }

    public void inorderRec(Node root){
        if (root!=null){
            inorderRec(root.left);
            System.out.print(root.data + " ");
            inorderRec(root.right);

        }
    }

    public void preorderRec(Node root){
        if (root!=null){
            System.out.print(root.data + " ");
            preorderRec(root.left);
            preorderRec(root.right);

        }
    }

    public void postorderRec(Node root){
        if (root!=null){
            
            postorderRec(root.left);
            postorderRec(root.right);
            System.out.print(root.data + " ");

        }
    }


    


    public static void main(String[] args) {
        int[] arr = {8,7,2,5,12,15};
        tree_implement ti = new tree_implement();
        for (int i=0;i<arr.length;i++){
            ti.insert(arr[i]);
        }
        System.out.print("INORDER : ");
        ti.inorder();
        System.out.println("");
        System.out.print("PREORDER : ");
        ti.preorder();
        System.out.println("");
        System.out.print("POSTORDER : ");
        ti.postorder();
        System.out.println("");
        ti.inorderIteration();
        ti.delete(7);
        System.out.println("");
        ti.inorderIteration();
    }











}

