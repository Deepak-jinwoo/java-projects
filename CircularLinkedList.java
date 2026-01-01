class CircularLinkedList <T> {
  class Node {
      T data;
      Node next;
      Node(T data){
          this.data = data;
          this.next = null;
      }
  }

  Node tail;

  CircularLinkedList () {
      tail = null;
  }

  void insertAtBegining(T data){
      Node newNode = new Node(data);
      if(tail == null){
          newNode.next = newNode;
          tail = newNode;
      }
      else{
          newNode.next = tail.next;
          tail.next = newNode;
      }
  }

  void insertAtLast(T data){
      Node newNode = new Node(data);
      if(tail == null){
          newNode.next = newNode;
          tail = newNode;
      }
      else{
          newNode.next = tail.next;
          tail.next = newNode;
          tail = newNode;
      }
  }
void display(){
      Node temp = tail;
      System.out.println();

      do{
          System.out.print(temp.data+"->");
          temp = temp.next;
      }while(temp != tail);
      
  }
 public static void main(String [] args){
      CircularLinkedList <Integer> list = new CircularLinkedList <>();
      list.insertAtBegining(7);
      list.insertAtBegining(5);
      list.insertAtBegining(1);
      list.insertAtLast(8);
list.display();
}
}