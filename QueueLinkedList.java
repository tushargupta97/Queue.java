public class QueueLinkedList {
   static class Node{
       static int data;
       static  Node next;
        Node(int data){
            this.data=data;
            this.next= null;
        }
    }
    static class Queue{
       static Node head=null ;
       static Node tail=null;
       public static boolean isEmpty(){
        return head == null && tail == null;
       }
       public static void add(int data){
        Node n= new Node(data);
        if(head==null){
            head =tail= n;
            return ;
        }
        tail.next=n;
        tail=n;
       }
       public static int remove(){
         if(isEmpty()){
            System.out.println("queue is empty");
            return -1;
         }
         int front =head.data;
        //single element
        if(tail==head){
            tail=head=null;
        }
        else{
            head=head.next;
        }
        return front;
    }
    public static int peek(){
        if(isEmpty()){
            return -1;
        }
        
        return head.data;
    }
    }

    public static void main(String args[]){
        Queue q=new Queue();
        q.add(1);
        q.add(2);q.add(3);
        q.add(4);q.add(5);
        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}

