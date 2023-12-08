    package QueueIntro;

        //NOTE: Implementing Queue using Array
        //Steps:
        // 1) front and rear at -1
        // 2) as soon as first element adds rear and front directed to that elem i.e. rear = 0 and front = 0
        // 3) if next elem adds then front remains same but rear moved to that next elem
        // 4) If we remove elem rear become -1 of that idx present

    import java.util.Arrays;

    //    NOTE: Queue by using arrays given O(n) complexity for removing elem that is why we don't implement queue using arrays
        public class QueueImplementationUsingArray {

        // NOTE: Create class QUeue

           static class Queue {
                static int [] arr;
                static int size;

                static int rear;

                Queue(int size) {
                    arr = new int[size];
                    this.size = size;
                    rear = -1;
                }

        //        isEmpty()
               public static boolean isEmpty() {
                    return rear == -1;
               }

               public static boolean isFull() {
                    return rear == size-1;
               }

        //       enqueue()
               public static void add(int data) {
        //            check queue is full or not if its full return

                   if(isFull()){
                       System.out.println("Queue is full");
                       return;
                   }
        //           if Queue is not full -> increment rear value and store the data value at arr[rear]
                   rear++;
                   arr[rear] = data;

               }

    //           Dequeue()

               public static int remove(){
    //                check queue is empty or not
                   if(isEmpty()) {
                       System.out.println("Queue is Empty");
                       return -1;
                   }

    //               remove the front and shift the all elem next
                   int front = arr[0];
    //               shifts the ele one idx ahead of their current idx
                   for(int i =0;i<rear;i++){
                       arr[i] = arr[i+1];
                   }
                   rear--;
                   return front;
               }
//               Peek()
               public static int peek() {
                    if(isEmpty()) {
                        System.out.println("As Queue is Empty we can't return the Peek value of queue");
                        return -1;
                    }
                    return arr[0];
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

                while(!q.isEmpty()) {
                    int peek = q.peek();
                    System.out.println(peek);
                    q.remove();
                }



            }

        }
