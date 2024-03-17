public class fibonacci_recursion {
    int a=0;
    int b=1;
    int sum=0;
    int x=0;

    public int recursion(int num){
        if (num == 1){
            return 1;
        }
        else{
            sum = a+b;
            a = b;
            b= sum;
            recursion(num-1);
        
        }
        return sum;
    }

    public void open(int x){
        if (x==5){
            System.out.println("open "+x);
        }
        else{
            System.out.println("open "+x);
            open(x+1);
        }
    }

    public void close(int x){
        if (x==5){
            System.out.println("closed "+x);
        }
        else{
            System.out.println("closed "+x);
            close(x+1);
        }
    }

    public static void main(String[] args) {
        int input = 3;
        fibonacci_recursion f1 = new fibonacci_recursion();
        int out = f1.recursion(input);
        System.out.println("the value is "+out);
        f1.open(1);
        f1.close(1);
    }


}
