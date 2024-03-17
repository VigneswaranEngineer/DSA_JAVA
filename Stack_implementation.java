

public class Stack_implementation {
    
    private int pointer = -1;

    private int[] arr = new int[10];

    

    public void push(int num){
        if (pointer != arr.length){
            ++pointer;
            arr[pointer] = num;
            System.out.println("element "+num+" is added");
        }
        else{
            System.out.println("stack is full");
        }
    }

    public void pop(){
        if (pointer!=-1){
            System.out.println("the element removed is "+arr[pointer]);
            --pointer;
        }
        else{
            System.out.println("stack is empty");
        }
    }

    public void peek(){
        System.out.println("the peek element is "+arr[pointer]);
    }

    public boolean isEmpty(){
        if (pointer == -1){
            return true;
        }
        else{
            return false;
        }
    }

    public void show(){
        for (int i=0;i<=pointer;i++){
            System.out.println(arr[i]+" ");
        }
    }

    public static void main(String args[]){

        Stack_implementation stack1 = new Stack_implementation();
        stack1.push(5);
        stack1.push(4);
        stack1.push(3);
        stack1.push(2);    
        stack1.push(1);    
        stack1.show();
        stack1.pop();
        stack1.pop();
        stack1.pop();
        stack1.show();
        stack1.peek();
        System.out.println(stack1.isEmpty());



    }
}
