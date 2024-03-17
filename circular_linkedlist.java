import java.util.HashSet;

class Node{
    int data;
    Node next;

    Node(int data){
        this.data=data;
        next=null;
    }
}

class circular_linkedlist{
    Node tail;
    Node head;
    int size;

    circular_linkedlist(){
        tail = null;
        head = null;
        size = 0;
    }

    int size() {
        return size;
     }
  
    boolean isEmpty() {
        return size == 0;
    }

    void insert(int value) {
        Node newNode = new Node(value);
        if (head == null) {
           head = newNode;
           tail = head;
           size++;
           return;
        } 
        else {

            tail.next = newNode;
            tail = newNode;
            tail.next = head;

            size++;
        }
    }

    void removeFirst(){
        if (head == null){
            System.out.println("linked list is empty");
        }
        else{
            head = head.next;
            tail.next = head;
        }
    }

    void removeLast(){
        if (head==null){
            System.out.println("linked list is empty");
        }
        else{
            int i=0;
            Node n = head;
            while(i<size-2){
                n = n.next;
                i++;
            }
            n.next = head;
            tail = n;
        }
        
    }

    void display() {
        if (tail == null) {
            System.out.println(head.data);
            return;
        }
        else{
            Node n = head;
            while (n != tail) {
                System.out.print(n.data + " --> ");
                n = n.next;
            }
            System.out.println(n.data);
        }
    }

    public void findValue(int num){
        int i=0;
        Node n =head;
        while(i<size-1){
            if (n.data==num){
                System.out.println("the element is in "+i+" position");
                break;
            }
            
            n = n.next;
            i++;
        }
    }

    public void removeRepetion(){
        
        HashSet<Integer> h1 = new HashSet<>();
        Node current = head;
        Node previous = null;
        while(current.next!=head){
            if (h1.contains(current.data)){
                previous.next = current.next;
                current = current.next;
                
            }
            else{
                h1.add(current.data);
                previous = current;
                current = current.next;
            }
            

        }
        System.out.println(h1);
    }

    public static void main(String[] args) {
        
        circular_linkedlist s = new circular_linkedlist();

        s.insert(1);
        s.insert(2);
        s.insert(2);
        s.insert(3);
        s.insert(5);
        s.insert(6);
        

        s.display();

        System.out.println(s.size);
        //s.removeLast();
        //s.display();
        s.findValue(4);
        s.removeRepetion();
        s.display();


    }
  
}

    
