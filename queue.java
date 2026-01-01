import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class queue {
    public static void main(String[] args) {
        Queue<Integer>s= new LinkedList<Integer>();
        
        s.offer(1);
        s.offer(2);
        s.offer(3);
        s.offer(4);
        s.offer(5);
     Stack<Integer>n = new Stack<Integer>();
     Queue<Integer>a= new LinkedList<Integer>();
     s.poll();
     s.poll();
     s.poll();
     n.push(1);
     n.push(2);
     n.push(3);
     int top=n.pop();
     a.offer(top);
     int top1= n.pop();
     a.offer(top1);
     int top2=n.pop();
     a.offer(top2);
     a.offer(4);
     a.offer(5);
     System.out.println(a);
    }
    
}
