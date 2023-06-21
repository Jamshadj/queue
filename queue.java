public class queue {
    class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
        }
    }

    public Node front;
    public Node rear;

    public void enqueue(int element){
        Node newNode=new Node(element);
        if(rear==null){
            front=rear=newNode;
            return;
        }
        rear.next=newNode;
        rear=newNode;
    }

    public void display(){
        Node temp=front;
        if(front==null){
            System.out.println("queue is empty");
            return;
        }
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }



    public static void main(String[] args) {
        queue list =new queue();
        list.enqueue(10);
        list.enqueue(20);
        list.enqueue(30);
        list.enqueue(40);
        list.enqueue(50);
        list.enqueue(60);
        list.enqueue(70);
        list.display();
        System.out.println("-----------");
        list.dequeue();
        list.display();
    }
}
