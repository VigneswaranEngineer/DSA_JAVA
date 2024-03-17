import java.util.ArrayList;
import java.util.HashSet;

    

public class missing_numbers {
    
    public void checkMissing(ArrayList<Integer> a){
        int sum=0;
        for (int i=1;i<a.size();i++){
            sum = sum + a.get(i);
        }
        int sum1 = 0;
        for (int i=0;i<a.size();i++){
            sum1 = sum1 + i;
        }
        int diff = sum-sum1;
        System.out.println("the missing number is : "+diff);
    }   

    public void usingHashSet(ArrayList<Integer> arr){
        HashSet<Integer> hs = new HashSet<>(arr);
        ArrayList<Integer> missing = new ArrayList<>();
        for(int i = 1; i <= arr.size(); i++){
            if(!hs.contains(i))
                missing.add(i);
        }
        System.out.println(missing);
    }

    

    
    
    
    public static void main(String[] args) {
        
        missing_numbers mn = new missing_numbers();
        ArrayList<Integer> a1 = new ArrayList<>();
        a1.add(1);        
        a1.add(2);
        a1.add(5);
        a1.add(6);   
        System.out.println(a1);
        mn.usingHashSet(a1);

        
    }
}
