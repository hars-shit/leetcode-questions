import java.util.Arrays;

public class leetcode_27 {
    public static void main(String[] args) {
        int[] nums={0,1,2,2,3,0,4,2};
      
        System.out.println(count(nums, 2));
    }
    static int count(int[] nums,int val){
       int index=0;
       for(int i=0;i<nums.length;i++){

           if(nums[i] != val){
               nums[index]=nums[i];
               index++;
            }
       }
       System.out.println(Arrays.toString(nums));
       return index;

    }
}
