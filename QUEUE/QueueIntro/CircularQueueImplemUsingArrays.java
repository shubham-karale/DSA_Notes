package QueueIntro;

public class CircularQueueImplemUsingArrays {

    static class CircularQueueImplementation {

        // NOTE: Create class QUeue

        static class Queue {
            static int[] arr;
            static int size;

            static int rear;
            static int front;

            Queue(int size) {
                arr = new int[size];
                this.size = size;
                rear = -1;
                front = -1;
            }

            public static boolean isEmpty() {
                return rear == -1 && front == -1;
            }
//NOTE: (rear+1) % size == front
            public static boolean isFull() {
                return (rear+1) % size == front ;
            }
//            Enqueue()
            public static void add(int data) {
                //            check queue is full or not if its full return
                if(isFull()){
                    System.out.println("Queue is full");
                    return;
                }
                if(front==-1) {front = 0;}
                // if Queue is not full -> increment rear value and store the data value at arr[rear]
                rear = (rear+1)%size;
                arr[rear] = data;

            }

//            Dequeue()
            public static int remove(){
                //                check queue is empty or not
                if(isEmpty()) {
                    System.out.println("Queue is Empty");
                    return -1;
                }
                int res = arr[front];
                if(front==rear){
                    front = rear = -1;
                } else {
                    front = (front+1) % size;
                }
                return res;
            }
//            Peek()
            public static int peek() {
                if(isEmpty()) {
                    System.out.println("As Queue is Empty we can't return the Peek value of queue");
                    return -1;
                }
                return arr[front];
            }

        }

        public static void main(String[] args) {
            System.out.println("Queue Implementation using Arrays");
            Queue q = new Queue(5);
            q.add(1);
            q.add(2);
            q.add(3);
            q.add(4);
            q.add(5);

            System.out.println(q);
            System.out.println(q.remove());
            q.add(6);
            System.out.println(q.remove());
            q.add(7);

            while (!q.isEmpty()){
                System.out.print(q.remove() + " ");
            }

        }


        }
    }

