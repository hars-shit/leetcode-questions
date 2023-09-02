public class leetcode_121 {
    public static void main(String[] args) {
        int[] profit={7,1,5,3,6,4};
        int max = 0;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<profit.length;i++){
            // calculate min 
            min=Math.min(min, profit[i]);

            // cal max diff 
            max=Math.max(max,profit[i]-min );
        }
        System.out.println(max);
    }
}
