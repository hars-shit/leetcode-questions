import java.util.Stack;

public class leetcode_496 {
    public static void main(String[] args) {
        Stack <Integer> stack=new Stack<>();
        int [] a={4,1,2};
        for(int i:a){

            stack.push(i);
            System.out.println(i);
        }
        System.out.println("dd"+stack.pop());
    }
}
