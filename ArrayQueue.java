/**
 * 
 * An implementation of the QueueInterface using an array-based implementation.
 * 
 * @param <T> The type of elements stored in the queue.
 */
public class ArrayQueue<T> implements QueueInterface<T> {
  private T[] storage;
  private int front;
  private int rear;
  private int numElements;

  /**
   * 
   * Constructs a new empty queue with an initial capacity of 10.
   */
  public ArrayQueue() {
    storage = (T[]) new Object[10];
    front = 0;
    rear = -1;
    numElements = 0;
  }

  /**
   * 
   * Adds the specified element to the end of the queue.
   * 
   * @param e The element to be added to the queue.
   */
  public void enqueue(T e) {
    if (numElements == storage.length) {
      T[] newStorage = (T[]) new Object[2 * storage.length];
      for (int i = 0; i < numElements; i++) {
        newStorage[i] = storage[(front + i) % storage.length];
      }
      storage = newStorage;
      front = 0;
      rear = numElements - 1;
    }
    rear = (rear + 1) % storage.length;
    storage[rear] = e;
    numElements++;
  }

  /**
   * 
   * Removes and returns the element at the front of the queue.
   * 
   * @return The element at the front of the queue.
   * @throws IllegalStateException If the queue is empty.
   */
  public T dequeue() {
    if (isEmpty()) {
      throw new IllegalStateException("The queue is empty!");
    }
    T result = storage[front];
    storage[front] = null;
    front = (front + 1) % storage.length;
    numElements--;
    return result;
  }

  /**
   * 
   * Returns the element at the front of the queue without removing it.
   * 
   * @return The element at the front of the queue.
   * @throws IllegalStateException If the queue is empty.
   */
  public T front() {
    if (isEmpty()) {
      throw new IllegalStateException("The queue is empty!");
    }
    return storage[front];
  }

  /**
   * 
   * Returns the number of elements in the queue.
   * 
   * @return The number of elements in the queue.
   */
  public int size() {
    return numElements;
  }

  /*
   * Returns true if the queue contains no elements.
   * 
   * @return true if the queue contains no elements, false otherwise.
   */
  public boolean isEmpty() {
    return numElements == 0;
  }
}
