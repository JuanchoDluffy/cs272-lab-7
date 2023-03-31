/**
 * A linked queue implementation of the QueueInterface interface. This queue
 * uses a singly linked list and has a front and rear pointer for efficient
 * enqueue and dequeue operations.
 *
 * @param <T> the type of elements held in this queue
 */
public class LinkedQueue<T> implements QueueInterface<T> {
  SNode<T> rear = null;
  SNode<T> front = null;
  int numElements = 0;

  /**
   * Constructs an empty LinkedQueue object.
   */
  public LinkedQueue() {
    rear = null;
    front = null;
    numElements = 0;
  }

  /**
   * Adds the specified element to the rear of this queue.
   *
   * @param e the element to add to the rear of this queue
   */
  @Override
  public void enqueue(T e) {
    SNode<T> newNode = new SNode<>(e);
    if (isEmpty()) {
      front = newNode;
      rear = newNode;
    } else {
      newNode.setNext(rear);
      rear = newNode;
    }
    numElements++;
  }

  /**
   * Removes and returns the element at the front of this queue.
   *
   * @return the element at the front of this queue
   * @throws IllegalStateException if this queue is empty
   */
  @Override
  public T dequeue() {
    // TODO Auto-generated method stub
    if (isEmpty()) {
      throw new IllegalStateException("Queue is empty");
    }
    SNode<T> tempNode = front;
    if (front == rear) {
      rear = null;
      front = null;
    } else {
      SNode<T> currNode = rear;
      while (currNode.getNext() != front) {
        currNode = currNode.getNext();
      }
      currNode.setNext(front.getNext());
      front = currNode;
    }
    numElements--;
    return tempNode.getData();
  }

  /**
   * Returns the element at the front of this queue without removing it.
   *
   * @return the element at the front of this queue
   * @throws IllegalStateException if this queue is empty
   */
  @Override
  public T front() {
    // TODO Auto-generated method stub
    if (isEmpty()) {
      throw new IllegalStateException("The queue is empty!");
    } else {
      return front.getData();
    }
  }

  /**
   * Returns the number of elements in this queue.
   *
   * @return the number of elements in this queue
   */
  @Override
  public int size() {
    return numElements;
  }

  /**
   * Returns true if this queue is empty, false otherwise.
   *
   * @return true if this queue is empty, false otherwise
   */
  @Override
  public boolean isEmpty() {
    if (rear == null) {
      return true;
    }
    return false;
  }

}
