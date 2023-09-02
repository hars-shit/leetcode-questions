import java.util.Arrays;

public class leetcode_238 {
    public static void main(String[] args) {
        int [] nums={1,2,3,4};
        int[] arr=new int[nums.length];
        int ans=1;
     for(int i=0;i<nums.length;i++){
        ans *=nums[i];
        
    }
    for(int j=0;j<nums.length;j++){
        arr[j]=ans/nums[j];
        
    }
    System.out.println(Arrays.toString(arr));

       
        }
    }

