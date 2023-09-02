public class leetcode_1967 {
    public static void main(String[] args) {
   String[] arr={"a","abc","bc","d"};
   String word="abc";
   int count=0;
   for(int i=0;i<arr.length;i++){
    if(word.contains(arr[i])){
        count++;
    }
   } 
   System.out.println(count);   
    }
    
}
