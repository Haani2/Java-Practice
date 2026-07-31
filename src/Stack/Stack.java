package Stack;


public class Stack extends StackException{
   protected int[] stack;
   private static final int DEAFULT_SIZE=10;
    int top=-1;
    int size=0;
    public Stack(){
        this(DEAFULT_SIZE); // calling  parameterize constructor by this and give the value of defaultSize
    }
    public Stack(int size){
        stack=new int[size];
    }

    public void push(int val){
        if(isFull()){
            System.out.println("Stack is overflow");
        }
        else{
            stack[++top]=val;
            size++;
        }
    }
    public void pop() throws StackException{
        if(isEmpty()){
            System.out.println("stack underflow");
            throw new StackException();
        }
        else{
            stack[top--]=0;
            size--;
        }
    }
    public void peek(){
        if(isFull()){
            System.out.println("Stack overflow");
        }
        else if(isEmpty()){
            System.out.println("Stack underflow");
        }
        else{
            System.out.println(stack[top]);
        }
    }
    public void display(){
        if(size>= stack.length){
            System.out.println("Stack overflow");
        }
        else if(top==-1){
            System.out.println("Stack underflow");
        }
        else{
            for (int j : stack) {
                System.out.println(j);
            }
        }
    }
    public boolean isFull(){
        return top == stack.length - 1;
    }
    public boolean isEmpty(){
        return top==-1;
    }
}
