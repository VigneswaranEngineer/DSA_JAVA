public class queue_array {
    private int[] array = new int[10];
    private int start = 0;
    private int rear = -1;
    

    public void insert(int num){
        if (rear == array.length){
            System.out.println("queue is full");
        }
        else{
            rear++;
            array[rear] = num;
        }
    }

    public void pop(){
        if (rear == -1){
            System.out.println("the queue is empty");
        }
        else{
            start++;
        }
    }

    public void show(){
        if (array.length!=0)
            for (int i=start;i<=rear;i++){
                System.out.println(array[i]);
            }
        else{
            System.out.println("queue is empty");
        }
    }


    public static void main(String[] args) {

        long start1 = System.currentTimeMillis();
        queue_array qa = new queue_array();
        qa.insert(10);
        qa.insert(11);
        qa.insert(12);
        qa.show();
        qa.pop();
        System.out.println("after popped a single element from queue ");
        qa.show();
        long end1 = System.currentTimeMillis();
        long total_time = end1 - start1;
        System.out.println("the total time taken for execution : "+total_time+" milliseconds"); 


        
    }
}
