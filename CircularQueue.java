public class CircularQueue {
    public static class Queue{
        static int arr[];
        static int front ;
        static int rear ;
        static int size;
        Queue(int n){
            arr=new int[n];
            size=n;
            front =-1;
            rear=-1;
        }
        public static boolean isEmpty(){
            return rear== -1 && front == -1;
        }
        public static boolean isFull(){
            return (rear+1)%size==front;
        }
        public static void add(int data){
            if(isFull()){
                System.out.println("queue is full");
                return;
            }
            rear=(rear+1)%size;
            arr[rear]=data;
            if(front ==-1){
                front=(front+1)%size;
            }
        }
        public static int remove(){
            if(isEmpty()){
                System.out.println("empty");
                return -1;
            }
            int data=arr[front];
            
            if(rear==front){   //last element delete
                rear=front=-1;
            }
            else{
                front =(front+1)%size;
            }
            return data;
        }     
        public static int peek(){
            if(isEmpty()){
                System.out.println("empty");
                return -1;
            }
            return arr[front];
        }
   }
   public static void main(String args[]){
    Queue q=new Queue(5);
    q.add(1);
    q.add(2);
    q.add(3);
    q.add(4);
    q.add(5);
    System.out.println(q.remove());
    q.add(6);
    System.out.println(q.remove());
    q.add(7);
    while(!q.isEmpty()){
        System.out.println(q.peek());
        q.remove();
    }
}
}

