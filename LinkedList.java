
class Node{
    int data;
    Node next;
}
public class LinkedList {

    Node head;

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

    public void middle(){
        int size=0;
        if (head==null){
            System.out.println("linked list is empty");
        }
        else{
            Node n = head;
            while(n.next!=null){
                size++;
                n = n.next;
            }
            size++;
        }
        int middle = size/2;
        Node n = head;
        for (int i=0;i<middle;i++){
            n = n.next;
        }    
        
        System.out.println("the middle element is "+n.data);

    }

    public void reverse(){
        if (head == null){
            System.out.println("linked list is empty");
        }
        else{
            Node current = head;
            Node previous = null;
            Node next = null;
            while(current!=null){
                next = current.next;
                current.next = previous;
                previous = current;
                current = next;
                
            }
            head = previous;
            
        }
    }

    

    public void deleteAtindex(int index){
        
        if (index==0){
            head = head.next;
        }
        else{
            Node n = head;
            for (int i=0;i<index-1;i++){
                n = n.next;
            }
            Node n1 = new Node();
            n1 = n.next;
            n.next = n1.next;

        }
    }

    public void insertAtstart(int b){
        Node node = new Node();
        node.data = b;
        node.next = null;
        node.next = head;
        head = node;
    }

    public void leftRotate(int count){
        
        for (int i=0;i<count;i++){
            if(head == null){
                System.out.println("linked list is empty");
            }
            else{
                Node n1 = head;
                head = n1.next;
                Node n = head;
                while(n.next !=null){
                    n = n.next;
                }
                n.next = n1;
                n1.next = null;
            }
        }
    }

    public void size(){
        int size=0;
        if (head==null){
            System.out.println("linked list is empty");
        }
        else{
            Node n = head;
            while(n.next!=null){
                size++;
                n = n.next;
            }
            size++;
            System.out.println("the size of the linked list is "+size);
        }
    }

    public void insertAtindex(int c , int index){
        Node node = new Node();
        node.data = c;
        node.next = null;
        if (index==0){
            insertAtstart(c);
        }

        else{
            Node n = head;
            for(int i=0;i<index-1;i++){
                n = n.next;
            }
            
            node.next = n.next;
            n.next = node;
        }
    }

    public void show(){
        Node node = head;
        while(node.next !=null){
            System.out.println(node.data);
            node = node.next;
        }
        System.out.println(node.data);
    }
    



    public static void main(String[] args){
        int[] arr = {1,2,3,4,5};
        LinkedList l1 = new LinkedList();
        for (int i=0;i<arr.length;i++){
            l1.insert(arr[i]);
        }
        l1.insertAtstart(1);
        l1.insertAtindex(5, 4);
        l1.deleteAtindex(3);
        l1.show();
        l1.size();

        // left rotate
        l1.leftRotate(3);
        l1.show();
        l1.middle();
        l1.reverse();
        l1.show();
        


        
        
        
    }
}
