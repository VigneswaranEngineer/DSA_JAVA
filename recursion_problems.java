
class Node{
    int data;
    Node next;
}

public class recursion_problems {
    
    int result;
    Node head;
    Node current;
    Node previous = null;

    public void alternative(int value){
        
        if (value%2==0){
            if (current.next == null){
                System.out.print(current.data);
                System.out.println(" ");
                value = 1;
                alternative(value);
            }
            else{
                System.out.print(current.data+" -->");
                current = current.next.next;
                alternative(value+2);
            }
        }
        else{
            if (previous.next.next == null){
                System.out.print(previous.data+"-->");
                System.out.println("null");
            }
            else{
                System.out.print(previous.data+" -->");
                previous = previous.next.next;
                alternative(value + 2);
            }
        }
    }

    public void selection(String input){
        current = head;
        if (input == "insert"){
            insertAfter(current);
        }
        else{
            if (input == "delete"){
            deleteRecursive(current);
            }
            else{
                previous = head.next;
                alternative(0);           
            }
        }
        
    }

    public void insertAfter(Node current){
        if (current.data==5){
            Node insertor = new Node();
            insertor.data = 20;
            insertor.next = current.next;
            current.next = insertor;
        }
        else{
            current = current.next;
            insertAfter(current);
        }
    }

    public String deleteRecursive(Node current){
        if (current.data == 10){
            previous.next = current.next;
            current = current.next;
        }
        else{
            previous = current;
            current = current.next;
            deleteRecursive(current);
        }
        return "node removed";
    }

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

    public int sum_of_natural_numbers(int num){
        
        if (num == 1){
            return num;
        }
        else{
            result = num + sum_of_natural_numbers(num-1);
        }
        return result;
    }

    public void show(){
        Node node = head;
        while(node.next !=null){
            System.out.print(node.data+" -->");
            node = node.next;
        }
        System.out.println(node.data);
    }

    public static void main(String[] args) {
        recursion_problems rp = new recursion_problems();

        // sum of n natural numbers using recursion
        // //int result = rp.sum_of_natural_numbers(5);
        // System.out.println(result);

        // // removing the node with 10 as data
         int[] arr = {1,10,5,45,6};
         for (int i=0;i<arr.length;i++){
             rp.insert(arr[i]);
         }
        // rp.show();

        // // removing the node with value 5 using recursion
        // rp.selection("delete");
        // rp.show();

        // // inserting the node with value 20 after node value with 5
        // rp.selection("insert");
        // rp.show();

        // Print alternative element in a linked list
        rp.selection("alternative");


    }


}
