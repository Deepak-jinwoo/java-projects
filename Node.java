class Node{
    int data;
    Node next;
    Node (int data){
        this.data=data;
        this.next=null;
    }
}
class Linkedlist {
    private Node head;
    void insertBegining(int data){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }
    void display(){
        Node temp=head;
        while(temp!=null){
            System.out.println(temp.data + " ");
            temp=temp.next;
        }
    }
    public static void main(String[] args) {
      Linkedlist  list=new Linkedlist();
        list.insertBegining(1);
        list.insertBegining(2);
        list.display();
    }
}