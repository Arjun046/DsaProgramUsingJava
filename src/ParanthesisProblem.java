import java.util.Stack;

public class ParanthesisProblem {
    static boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char cur = s.charAt(i);
            if (isOpening(cur)) {
                st.push(cur);
            } else {
                if (st.isEmpty()) {
                    return false;
                } else if (!isMatching(st.peek(), cur)) {
                    return false;
                } else {
                    st.pop();
                }
            }
        }
        return st.isEmpty();
    }

    static boolean isOpening(char c) {
        return c == '{' || c == '(' || c == '[';
    }

   static boolean isMatching(char a, char b) {
        return (a == '{' && b == '}') ||
                (a == '(' && b == ')') ||
                (a == '[' && b == ']');
    }
    public static void main(String[] args) {
        String s = "(({})";
        if (isValid(s)){
            System.out.println("true");


        }else {
            System.out.println("false");
        }
    }
}

