public class leetcode_168 {
    public static void main(String[] args) {
        int columnNumber=25;
        String ans = "";
        System.out.println("annn"+25%26);
        while (columnNumber>0){
            columnNumber--;
            ans = (char) ('A'+ (columnNumber%26)) + ans;
            columnNumber = columnNumber/26;
        }
        System.out.println(ans);
    }
}
