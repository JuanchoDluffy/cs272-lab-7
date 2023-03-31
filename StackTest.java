public class StackTest {
  public static void main(String[] args) {
    System.out.println("--Test case 1: Testing isEmpty() and push() methods--");
    LinkStack<Integer> test1 = new LinkStack<Integer>();
    System.out.println("Is the stack empty? " + test1.isEmpty()); // should print true
    for (int i = 0; i < 1000; i++) {
      test1.push(i);
    }
    System.out.println("After pushing 1000 elements, is the stack empty? " + test1.isEmpty()); // should print false
    System.out.println();

    // Test case 2 - testing size() and pop() methods
    System.out.println("--Test case 2: Testing size() and pop() methods--");
    System.out.println("The size of the stack is: " + test1.size()); // should print 1000
    test1.pop();
    System.out.println("The size of the stack after popping one element is: " + test1.size()); // should print 999
    System.out.println("The top element of the stack is: " + test1.top()); // should print 998
    System.out.println();

    // Test case 3 - testing push() and top() methods with strings
    System.out.println("--Test case 3: Testing push() and top() methods with strings--");
    LinkStack<String> test2 = new LinkStack<String>();
    test2.push("cat");
    test2.push("dog");
    test2.push("tiger");
    System.out.println("The top element of the stack is: " + test2.top()); // should print "tiger"
    test2.pop();
    System.out.println("The top element of the stack after popping one element is: " + test2.top()); // should print dog
    System.out.println();

    // Test case 4 - testing push() method with different types
    System.out.println("--Test case 4: Testing push() method with different types--");
    LinkStack<Object> test3 = new LinkStack<Object>();
    test3.push("apple");
    test3.push(25);
    test3.push(2.5);
    test3.push(test2);
    System.out.println("The size of the stack is: " + test3.size()); // should print 4
    System.out.println();
  }

}
