import java.util.Arrays;

public class leetcode_136 {
    public static void main(String[] args) {
        int [] nums={4,1,2,1,2};
        Arrays.sort(nums);
        for(int i=0;i+1<nums.length;i++){
            if(nums[i] != nums[i+1]){
                System.out.println(nums[i]);
            }
            
        }
    }
}
