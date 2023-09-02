public class leetcode_122 {
    public static void main(String[] args) {
        int [] arr={1,2,3,4,5};
        System.out.println(total(arr));
    }
    static int total(int[] arr){
        int profit=0;
        for(int i=1;i<arr.length;i++){
            if(arr[i]>arr[i-1]){
                profit+=arr[i]-arr[i-1];
            }
        }
        return profit;
    }
}
