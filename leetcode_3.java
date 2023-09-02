public class leetcode_3 {
    public static void main(String[] args) {
    String s="pwwkew";
 
    System.out.println(longest(s));  
    // longest(s);
    }
    static int longest(String s){
        int count=1;
       int i=0;
       int j=1;
      int min=Integer.MAX_VALUE;
       char [] arr=s.toCharArray();
       while(j<arr.length){
        if(arr[i]==arr[i+1]){
            i++;
        }
           if(arr[i]!=arr[j]){
             
               if(i+1 != j){
                   i++;
                }

                else{
                    count++;
                    i=0;
                    j++;
                }
            }
            
            else{
                j++;
                min=Math.min(count, min);
                
            }
        }
     return count;
    }

}
