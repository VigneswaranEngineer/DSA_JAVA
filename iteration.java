import java.util.*;

public class iteration {
    public static void main(String[] args) {
        ArrayList<Integer> s = new ArrayList<>();
        
        s.add(10);
        s.add(1);
        s.add(0);
        s.add(5);
        s.add(32);
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        Iterator<Integer> l = s.iterator();
        while(l.hasNext()){
            Integer x = l.next();
            if (x>max){
                max = x;
            }
            if (x<min){
                min = x;
            }
            else{
                continue;
            }
        }
        System.out.println(max+" "+min);

    }
}
