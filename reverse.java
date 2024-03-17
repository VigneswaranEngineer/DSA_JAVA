import java.util.*;

public class reverse {
    ArrayList<Integer> l;
    
    static void rev(ArrayList<Integer> l1, int start , int end){
        while(start<end){
            int temp = l1.get(start);
            l1.set(start, l1.get(end));
            l1.set(end,temp);
            ++start;
            --end;
        }
        
        
    }

    public static void main(String args[]){
        ArrayList<Integer> l1 = new ArrayList<Integer>();
        l1.add(5);
        l1.add(4);
        l1.add(3);
        l1.add(2);
        l1.add(1);
        System.out.println(l1);
        rev( l1, 0, 3);
        System.out.println(l1);
    }
}
