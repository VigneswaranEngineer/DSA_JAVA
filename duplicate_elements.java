import java.util.ArrayList;

public class duplicate_elements {

    static int check(int value, ArrayList<Integer> arr1){
        for (int i=0;i<arr1.size();i++){
            if (value == arr1.get(i)){
                return 0;
            }
            else{
                continue;
            }
        }
        return 1;
    }
    

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(2);
        arr.add(5);
        arr.add(3);
        arr.add(2);
        arr.add(5);
        arr.add(8);
        System.out.println("before removing duplicate : "+arr);
        System.out.println(arr.size());
        ArrayList<Integer> arr1 = new ArrayList<>();
        for (int i=0;i<arr.size();i++){
            int temp = arr.get(i);
                if (check(temp,arr1)==1){
                    arr1.add(temp);
                }
        }
   
        System.out.println("after removing duplicate"+arr1);

    }
}
