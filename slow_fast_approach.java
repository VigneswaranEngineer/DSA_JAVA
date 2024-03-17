import java.util.HashMap;

class Node{
    int data;
    Node next;
}
public class slow_fast_approach {
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

    public int slow_fast(){
        Node slow = head;
        Node fast = head;
        while(fast.next!=null && fast.next.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            
        }
        return slow.data;

    }

    public void show(){
        Node node = head;
        while(node.next !=null){
            System.out.print(node.data+"--->");
            node = node.next;
        }
        System.out.println(node.data);
    }

    public static void main(String[] args) {
        slow_fast_approach sf = new slow_fast_approach();
        sf.insert(5);
        sf.insert(6);
        sf.insert(7);
        sf.insert(8);
        sf.insert(9);
        sf.insert(1);
        sf.show();
        int middle = sf.slow_fast();
        System.out.println("the middle element is "+middle);

        String[] s = {"rfrrrgreg"};
        int x = s.length;
        HashMap<Character,Integer> h1 = new HashMap<>();
        h1.put('{',1);
        h1.get('{');

    }
}
