import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class stac {
    public static void main(String[] args) {
        Queue<Integer>s= new LinkedList<Integer>();
        
        s.offer(1);
        s.offer(2);
        s.offer(3);
        s.offer(4);
        s.offer(5);
     Stack<Integer>n = new Stack<Integer>();
     Queue<Integer>a= new LinkedList<Integer>();
     for(int i=1 ; i<=3 ; i++)
        {
     s.poll();// remove 3 elemnt
     n.push(i);// add 3 element in stack 
        }
     for(int i=0; i<3;i++){
        a.offer(n.pop());

     }
    //  for(int i=0;i<3; i++){

    //  }
     a.offer(4);
     a.offer(5);
     System.out.println(a);
    }
    
}
