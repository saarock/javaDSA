package OUEUE;
public class myOqueue1 {
// Queue Which iis called the FIFI N(FITST IN FIRST OUT) ALSO;
    
// Queue By simply using array wich is not better Choice;
    static int arr[];
    static int rear = -1;

    static int size;
    myOqueue1(int n) {
        arr = new int[n];
   this.size = n;
    }


    // Function to check the Queue is empty or not;
    public static boolean isEmpty() {
        return rear == -1;
    }


    // Function method to add the elements on teh Queue;
    public static void add(int data) {
        if(rear== size-1) {
            System.out.println("Full Queu");
        }

        rear++;
        arr[rear] = data;
      
    }

    // Function to remove the elements from the queue
    public static int remove() {
        if(isEmpty()) {
            return -1;
        }

        int front = arr[0];
        for(int i=0; i<rear; i++) {
            arr[i] = arr[i+1];
            System.out.println("empty queue");
          
        }
        return front;
    }


    // function methos for simple to acess the element from the queue
    public static int peek(int i) {
        if(isEmpty()) {
            System.out.println("Que is Empty");
            return -1;
        }
        return arr[i];
    }
    public static void main(String[] args) {
        System.out.println("Let's start Queue");
        // Make the new object from the class;
        myOqueue1 q = new myOqueue1(5);
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

        // Peek one by one
        int p0 = peek(0);
        int p1= peek(1);
        int p2 = peek(2);
        int p3 = peek(2);
        int p4 = peek(2);
        System.out.println(p0);
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(p4);
   
    }
}
