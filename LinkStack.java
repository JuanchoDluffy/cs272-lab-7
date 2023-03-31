import java.util.*;

/**
 * A stack implemented using a singly linked list.
 *
 * @param <T> the type of elements stored in the stack.
 */
public class LinkStack<T> implements StackInterface<T> {
  private SNode<T> top = null;

  /**
   * Removes and returns the top element of the stack.
   *
   * @return the top element of the stack.
   * @throws NoSuchElementException if the stack is empty.
   */
  @Override
  public T pop() {
    if (this.isEmpty()) {
      throw new NoSuchElementException("Stack is empty");
    }
    SNode<T> topNode = top;
    top = top.getNext();
    return topNode.getData();
  }

  /**
   * Adds a new element to the top of the stack.
   *
   * @param e the element to be added to the stack.
   */
  @Override
  public void push(T e) {
    SNode<T> pushNode = new SNode<T>(e);
    pushNode.setNext(top);
    top = pushNode;
  }

  /**
   * Returns the top element of the stack without removing it.
   *
   * @return the top element of the stack.
   * @throws NoSuchElementException if the stack is empty.
   */
  public T top() {
    if (this.isEmpty()) {
      throw new NoSuchElementException("Stack is empty");
    }
    return top.getData();
  }

  /**
   * Returns the number of elements in the stack.
   *
   * @return the number of elements in the stack.
   */
  @Override
  public int size() {
    int answer = 0;
    SNode<T> iteratorNode = top;
    while (iteratorNode != null) {
      answer++;
      iteratorNode = iteratorNode.getNext();
    }
    return answer;
  }

  /**
   * Checks if the stack is empty.
   *
   * @return true if the stack is empty, false otherwise.
   */
  public boolean isEmpty() {
    if (top == null) {
      return true;
    } else {
      return false;
    }
  }

}
