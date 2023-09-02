

public class leetcode_189 {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7};
        int k=3;
       int t=0;
        int [] nums=new int[arr.length];
        for(int i=k;i>=0;i--){
            nums[t] = arr[i];
            t++;
          
        }
        for(int j=arr.length-1;j>k;j--){
            nums[t]=arr[j];
            t++;
        }
        for(int l=nums.length-1;l>=0;l--){
            System.out.print(nums[l]);
        }
  
    }
}
