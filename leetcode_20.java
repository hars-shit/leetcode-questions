import java.util.Stack;

public class leetcode_20 {
    public static void main(String[] args) {
        String s = "({})";
        System.out.println(check(s));
    }

    static boolean check(String s) {
        char[] arr = s.toCharArray();
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == '{' || arr[i] == '(' || arr[i] == '[') {
                stack.push(arr[i]);
            } else {
                if (arr[i] == ')') {
                    if (stack.isEmpty() || stack.pop() != '(') {
                        return false;
                    }
                }
                if (arr[i] == ']') {
                    if (stack.isEmpty() || stack.pop() != '[') {
                        return false;
                    }
                }
                if (arr[i] == '{') {
                    if (stack.isEmpty() || stack.pop() != '{') {
                        return false;
                    }
                }
            }
        }
        return stack.isEmpty();

    }

}
