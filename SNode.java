/**
 * Represents a node in a singly linked list.
 * 
 * @param <E> the type of data stored in the node
 */

public class SNode<E> {
  private E data;
  private SNode<E> next = null;

  /**
   * Constructor for creating a new SNode with the given data.
   * 
   * @param data the data to be stored in the node
   */
  public SNode(E data) {
    this.data = data;
  }

  /**
   * Constructor for creating a new SNode with the given data and next node.
   * 
   * @param data the data to be stored in the node
   * @param next the next node in the list
   */
  public SNode(E data, SNode<E> no) {
    this.data = data;
    this.next = no;
  }

  /**
   * Returns the data stored in the node.
   * 
   * @return the data stored in the node
   */
  public E getData() {
    return this.data;
  }

  /**
   * Returns the next node in the list.
   * 
   * @return the next node in the list
   */
  public SNode<E> getNext() {
    return this.next;
  }

  /**
   * Sets the data stored in the node to the given value.
   * 
   * @param data the new value for the data in the node
   */
  public void setData(E dat) {
    this.data = dat;
  }

  /**
   * Sets the next node in the list to the given node.
   * 
   * @param next the new next node in the list
   * 
   */
  public void setNext(SNode<E> e) {
    this.next = e;
  }
}
