package leetcode;

import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args) {
        //s = "()"
        //Output: true
        //System.out.println(isValid("()"));

        //Input: s = "()[]{}"
        //Output: true
        //System.out.println(isValid("()[]{}"));

        //Input: s = "(]"
        //Output: false
        //System.out.println(isValid("(]"));

        //Input: s = "([])"
        //Output: true
        //System.out.println(isValid("([])"));

        //Input: s = "(){}}{"
        //Output: true
        System.out.println(isValid1("(){}}{"));
    }

    //O(n)
    static boolean isValid1(String s) {
        if(s == null || s.length() == 0) return true;
        if(s.length() == 1) return false;

        Stack<Character> stack = new Stack<>();

        stack.push(s.charAt(0));

        for (int i = 1; i < s.length(); i++) {
            char c = s.charAt(i);
            if(c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else {
                char top;
                if(stack.isEmpty()) {
                    stack.push(c);
                    continue;
                }
                top = stack.peek();
                if(c == ')' && top == '(' || c == '}' && top == '{' || c == ']' && top == '[') {
                    stack.pop();
                }
                else stack.push(c);
            }
        }

        if(stack.isEmpty()) return true;
        else return false;
    }

    //O(n)
    static boolean isValid2(String s) {
        Stack<Character> stack = new Stack<Character>();
        for (char c : s.toCharArray()) {
            if (c == '(')
                stack.push(')');
            else if (c == '{')
                stack.push('}');
            else if (c == '[')
                stack.push(']');
            else if (stack.isEmpty() || stack.pop() != c)
                return false;
        }
        return stack.isEmpty();
    }
}
