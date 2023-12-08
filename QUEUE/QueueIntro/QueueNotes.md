# *Queue Notes*

#### **Queue** is a linear data structure which follows a particular order in which the operations are performed. The order is _**First In First Out (FIFO)**_. A good example of a queue is any queue of consumers for a resource where the consumer that came first is served first. The difference between stacks and queues is in removing. In a stack we remove the item the most recently added; in a queue, we remove the item the least recently added.

 ## Analogies:
    - **Queue**:  It is similar to the ticket queue outside a cinema hall, where the first person entering the queue is the first person who gets the ticket.

  - front: the item that would be removed next
  - rear: the item most recently added
  - **Definition**: _**putting items in the queue is called enqueue, and removing items from the queue is called dequeue._**

## **Operations on Queue**:


    -Enqueue: Add an element to the end of the queue
    -Dequeue: Remove an element from the front of the queue
    -IsEmpty: Check if the queue is empty
    -IsFull: Check if the queue is full
    -Peek: Get the value of the front of the queue without removing it

## **Working Of Queue**
    
   

Queue operations work as follows:

    -two pointers FRONT and REAR
    -FRONT track the first element of the queue
    -REAR track the last element of the queue
    -initially, set value of FRONT and REAR to -1

Enqueue Operation

    -check if the queue is full
    -for the first element, set the value of FRONT to 0
    -increase the REAR index by 1
    -add the new element in the position pointed to by REAR

Dequeue Operation

    -check if the queue is empty
    -return the value pointed by FRONT
    -increase the FRONT index by 1
    -for the last element, reset the values of FRONT and REAR to -1


## *Complexity Analysis:*

    -Time Complexity: O(1). All operations like enqueue(), dequeue(), isFull(), isEmpty() all take constant time. 
    -Space Complexity: O(N). N is the size of array for storing elements.


## *Applications of Queue:*

    -CPU scheduling, Disk Scheduling
    -When data is transferred asynchronously between two processes.The queue is used for synchronization. For example: IO Buffers, pipes, file IO, etc
    -Handling of interrupts in real-time systems.
    -Call Center phone systems use Queues to hold people calling them in order.



