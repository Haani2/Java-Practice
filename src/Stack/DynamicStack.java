package Stack;

public class DynamicStack extends Stack{
    public DynamicStack(){
        super();
    }
    public DynamicStack(int val){
        super(val);
    }
    @Override
    public void push(int val){
        if(isFull()){
            int[] temp= new int[size*2];
            for (int i = 0; i < stack.length; i++) {
                temp[i]=stack[i];
            }
            stack=temp;
        }
        super.push(val);
    }
}
