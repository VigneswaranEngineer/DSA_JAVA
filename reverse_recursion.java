
// reverse the linked list using recursion


class Node{
    int data;
    Node next;
}
public class reverse_recursion {
    
    Node head;
    Node current;
    Node previous;

    public void insert(int num){
        Node node = new Node();
        node.data = num;
        node.next = null;
        if (head==null){
            head = node;
        }
        else{
            Node n = head;
            while(n.next !=null){
                n = n.next;
            }
            n.next = node;
        }
    }

    public void show(){
        Node node = head;
        while(node.next !=null){
            System.out.print(node.data+" --> ");
            node = node.next;
        }
        System.out.println(node.data);
    }

    void reverse(){
        head = reverse(head, null);
    }

    public Node reverse(Node current , Node previous){
        if (current == null){
            return previous;
        }
        
            Node next = current.next;
            current.next = previous;
        
        return reverse(next , current);
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        reverse_recursion rr = new reverse_recursion();
        for (int i=0;i<arr.length;i++){
            rr.insert(arr[i]);
        }
        rr.show();
        rr.reverse();
        rr.show();
    }
}
