
class Node{
    int data;
    Node next;
}
public class palindrome_linkedlist {
    Node head1;
    int size;
    
    public void insert(int num){
        Node node = new Node();
        node.data = num;
        node.next = null;
        if (head1==null){
            head1 = node;
        }
        else{
            Node n = head1;
            while(n.next !=null){
                n = n.next;
            }
            n.next = node;
        }
    }
    public void show(){
        Node node = head1;
        while(node.next !=null){
            System.out.print(node.data+" --> ");
            node = node.next;
        }
        System.out.print(node.data);
    }

    public void size(){
        int size1=0;
        if (head1==null){
            System.out.println("linked list is empty");
        }
        else{
            Node n = head1;
            while(n.next!=null){
                size1++;
                n = n.next;
            }
            size1++;
            System.out.println("the size of the linked list is "+size1);
        }
    }

    public static void main(String args[]){
        int[] arr = {1,4,3,2,1};
        palindrome_linkedlist pl = new palindrome_linkedlist(); 
        for (int i=0;i<arr.length;i++){
            pl.insert(arr[i]);
        }
        linkedlist_2 ll = new linkedlist_2();
        for (int i=arr.length-1;i>=0;i--){
            ll.insert(arr[i]);
        }

        pl.show();
        ll.show();
        System.out.println("");
        boolean b = ll.checkPalindrome();
        if (b==true){
            System.out.println("it is a palindrome");
        }
        else{
            System.out.println("no it is not a palindrome");
        }


    }
}

class linkedlist_2 extends palindrome_linkedlist{
    Node head2;
    

    public void insert(int num){
        Node node = new Node();
        node.data = num;
        node.next = null;
        if (head2==null){
            head2 = node;
        }
        else{
            Node n = head2;
            while(n.next !=null){
                n = n.next;
            }
            n.next = node;
        }
    }
    public void show(){
        System.out.println(" ");
        Node node = head2;
        while(node.next !=null){
            System.out.print(node.data+" --> ");
            node = node.next;
        }
        System.out.print(node.data);
    }

    public boolean checkPalindrome(){
        Node n1 = head1;
        Node n2 = head2;
        int i=0;
        while(i<size){
            if (n1.data == n2.data){
                n1 = n1.next;
                n2 = n2.next;
            }
            else{
                return false;
            }
            i++;
        }
        return true;
    }

    


}
