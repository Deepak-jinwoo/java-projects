import java.util.*;
public class stack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter how many time paranthesis should be entered");
        int n = scanner.nextInt();
        String s;
        char ch;
       
      for(int i = 0 ; i < n ; i++){
         Stack<Character>stack=new Stack<>();
        s = scanner.next();
      
     for(int j = 0 ; j < s.length() ; j++){
          ch = s.charAt(j);
  if (ch == '(') {
                stack.push(')');
            } else if (ch == '[') {
                stack.push(']');
            } else if (ch == '{') {
                stack.push('}');
            }
            else{
                 if (stack.isEmpty() || stack.pop() != ch){
                    System.out.println("false");
                }
            } 
        }
            if (stack.isEmpty()) {
                System.out.println("good correct");
                
            }
            
            else{
                System.out.println("false");
            }
            }
        

     }
       
    }
    

