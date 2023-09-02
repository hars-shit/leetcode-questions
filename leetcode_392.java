public class leetcode_392 {
    public static void main(String[] args) {
        String s="axc";
        String t="ahbgdc";
        System.out.println(sub(s, t));
    }
    static boolean sub( String s,String t){
        char [] arr1=s.toCharArray();
        char [] arr2=t.toCharArray();
        int i=0;
        int j=0;
        int count =0;
        while(j<arr2.length){
            if(arr1[i]==arr2[j]){
                count++;
                i++;
                j++;
            }
            else{
                j++;
            }
        }
        if(count==arr1.length){
            return true;
        }
        else{
            return false;
        }
    }
}
