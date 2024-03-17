import java.util.*;


class wrapperClass{

    public static void main(String[] args) {
        
        String a="vikki";
        String k = a;
        System.out.println("the auto unboxing is "+k);
        Integer x = 5;
        int y =x;
        System.out.println("the auto boxing value is "+y);

        List<Integer> c1 = new ArrayList<Integer>();
        c1.add(5);
       
        c1.add(10);
        c1.add(32);
        c1.add(4);
        System.out.println(c1);
        System.out.println(c1.size());
        System.out.println(c1.contains(10));
        System.out.println(c1.isEmpty());
        c1.remove(2);
        System.out.println(c1);
        c1.sort(null);
        System.out.println(c1);
        //c1.clear();
        //System.out.println(c1);
        c1.add(3, 3);
        System.out.println(c1);
        System.out.println(c1.get(3));

        c1.remove(new Integer(10));
        System.out.println(c1);
        c1.add(7);
        System.out.println(c1);
        

    }
}