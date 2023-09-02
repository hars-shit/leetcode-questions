
public class leetcode_448 {
    public static void main(String[] args) {
        int [] arr={4,3,2,7,8,2,3,1};
            for(int i=0;i<arr.length;i++){
                int ind= Math.abs(arr[i])-1;
             if(arr[ind]<0){
                continue;
             }  
             arr[ind] *= -1;
            }
            for(int i=0;i<arr.length;i++){
                if(arr[i] > 0){
                    System.out.println(i+1);
                }
            }

    
    }
}
