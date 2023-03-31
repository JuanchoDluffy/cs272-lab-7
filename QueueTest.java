public class QueueTest {
  public static void main(String[] args) {
    ArrayQueue<String> queue = new ArrayQueue<>();

    // Test isEmpty() and size() on an empty queue
    System.out.println("Is the queue empty? " + queue.isEmpty()); // should print true
    System.out.println("Size of the queue: " + queue.size()); // should print 0

    // Test enqueue() and size() on a non-empty queue
    queue.enqueue("apple");
    queue.enqueue("banana");
    queue.enqueue("cherry");
    System.out.println("Size of the queue: " + queue.size()); // should print 3

    // Test front() on a non-empty queue
    System.out.println("The front item is: " + queue.front()); // should print "apple"

    // Test dequeue() and size() on a non-empty queue
    queue.dequeue();
    System.out.println("Size of the queue: " + queue.size()); // should print 2

    // Test dequeue() and isEmpty() on a queue with one element
    queue.dequeue();
    System.out.println("Is the queue empty? " + queue.isEmpty()); // should print false
    queue.dequeue();
    System.out.println("Is the queue empty? " + queue.isEmpty()); // should print true

    // Test dequeue() on an empty queue
    // queue.dequeue(); // should throw an exception
    ArrayQueue<Integer> queue2 = new ArrayQueue<>();

    // Enqueue integers from 1 to 15
    for (int i = 1; i <= 15; i++) {
      queue2.enqueue(i);
    }

    // Dequeue integers and make sure they are in order
    for (int i = 1; i <= 15; i++) {
      int dequeued = queue2.dequeue();
      if (dequeued != i) {
        System.out.println("Error: Dequeued value " + dequeued + " is out of order.");
      } else {
        System.out.println("Dequeued value: " + dequeued);
      }
    }

    System.out.println(" ------same tests for the linked queue----------");
    LinkedQueue<String> queue4 = new LinkedQueue<>();

    // Test isEmpty() and size() on an empty queue
    System.out.println("Is the queue empty? " + queue4.isEmpty()); // should print true
    System.out.println("Size of the queue: " + queue4.size()); // should print 0

    // Test enqueue() and size() on a non-empty queue
    queue4.enqueue("apple");
    queue4.enqueue("banana");
    queue4.enqueue("cherry");
    System.out.println("Size of the queue: " + queue4.size()); // should print 3

    // Test front() on a non-empty queue
    System.out.println("The front item is: " + queue4.front()); // should print "apple"

    // Test dequeue() and size() on a non-empty queue
    queue4.dequeue();
    System.out.println("Size of the queue: " + queue4.size()); // should print 2

    // Test dequeue() and isEmpty() on a queue with one element
    queue4.dequeue();
    System.out.println("Is the queue empty? " + queue4.isEmpty()); // should print false
    queue4.dequeue();
    System.out.println("Is the queue empty? " + queue4.isEmpty()); // should print true

    // Test dequeue() on an empty queue
    // queue.dequeue(); // should throw an exception
    ArrayQueue<Integer> queue5 = new ArrayQueue<>();

    // Enqueue integers from 1 to 15
    for (int i = 1; i <= 15; i++) {
      queue5.enqueue(i);
    }

    // Dequeue integers and make sure they are in order
    for (int i = 1; i <= 15; i++) {
      int dequeued = queue5.dequeue();
      if (dequeued != i) {
        System.out.println("Error: Dequeued value " + dequeued + " is out of order.");
      } else {
        System.out.println("Dequeued value: " + dequeued);
      }
    }
  }

}
