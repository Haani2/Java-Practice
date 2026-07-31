package Queue;

public class Queue {
   private final int[] data;
    private static final int DEFAULT_VALUE=10;
        int end=0;
        public Queue(){
            this(DEFAULT_VALUE);
        }
        public Queue(int size){
            this.data=new int[size];
        }


        public boolean isFull(){
            return end==data.length-1;
        }
        public boolean isEmpty(){
            return end==-1;
        }
        public boolean insert(int val){
            if(isFull()){
                return false;
            }
                data[end++]=val;
           return true;
        }
        public int remove() throws Exception{
            if(isEmpty()){
                throw new Exception("This is empty queue");
            }
            int remove=data[0];
            for(int i=1;i<end;i++){
                data[i-1]=data[i];
            }
            end--;
            return remove;
    }
    public void display(){
        for (int i = 0; i < end; i++) {
            System.out.println(data[i]);
        }
    }


}
