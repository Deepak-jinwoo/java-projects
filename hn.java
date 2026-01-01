import java.util.*;

public class hn {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the parenthesis string:");
        String s = scanner.nextLine();

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char a = s.charAt(i);

            
            if (a == '(' || a == '[' || a == '{') {
                stack.push(a);
            } else {
                if (stack.isEmpty()) {
                    System.out.println("false");
                    return;
                }

                char top = stack.pop();

                // Check matching pairs
                if (a == ')' && top != '(') {
                    System.out.println("false");
                    return;
                } else if (a == ']' && top != '[') {
                    System.out.println("false");
                    return;
                } else if (a == '}' && top != '{') {
                    System.out.println("false");
                    return;
                }
                    else{
                        System.out.println("its right");
                    }
                
            }
        }

        // Final check: stack must be empty
        
    }
}