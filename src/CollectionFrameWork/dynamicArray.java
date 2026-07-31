package CollectionFrameWork;

public class dynamicArray {
    Integer val;
   private int[] nums= new int[10];
    public void add(int val){
        this.val=val;
        int count=0;
        if(count<nums.length-1){
            nums[count++]=val;

        }
        else{
            int[] doubleArray=new int[nums.length*2];
            for (int i = 0; i <nums.length; i++) {

            }
        }
    }
}