public class leetcode_134 {
    public static void main(String[] args) {
        int[] gas={1,2,3,4,5};
        int[] cost={3,4,5,1,2};
        int current=0;
        int start=0;
        int total_gas=0;
        int total_cost=0;
        for(int i=0;i<gas.length;i++){
            total_gas +=gas[i];
        }
         for(int i=0;i<cost.length;i++){
            total_cost +=cost[i];
        }
       if(total_gas<total_cost){
        System.out.println("-1");
       }
       for(int i=0;i<gas.length;i++){
        current += gas[i]-cost[i];
        if(current<0){
            start=i+1;
            current=0;
        }
       }
        System.out.println(start);

    }
}
