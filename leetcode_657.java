public class leetcode_657 {
    public static void main(String[] args) {
        String str="LL";
        System.out.println(moves(str));
        
    }
    static boolean moves(String str){
        
        if(str.length()%2 ==1){
           return false;
        }
       
            int vert=0;
            int hori=0;
                char [] arr=str.toCharArray();
            for(int i=0;i<arr.length;i++){
                if(arr[i]=='U'){
                    vert++;
                }
                else if(arr[i]=='D'){
                    vert--;
                }
                else if(arr[i]=='L'){
                    hori++;
                }
                else if(arr[i]=='R'){
                    hori--;
                }
            
            
        }
        return vert==0 && hori==0;
    }
}
