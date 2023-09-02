
public class leetcode_58 {
    public static void main(String[] args) {
        String s = "   fly me   to   the moon  ";
        int count = 0;
       
        System.out.println(last(s, count));

    }

    static int last(String s, int count) {

        char[] arr = s.toCharArray();
        // System.out.println(Arrays.toString(arr));
        for (int i = arr.length - 1; i >= 0; i--) {
            if(count==0 && arr[i]==' '){
                continue;
            }
            else if(arr[i] != ' '){
                count++;
            }
            else{
                break;
            }
        }

        return count;
    }
}
