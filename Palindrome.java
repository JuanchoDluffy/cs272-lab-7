public class Palindrome {
  public static boolean isPalindrome(String input) {
    LinkedQueue<String> queue = new LinkedQueue<>();
    LinkStack<String> stack = new LinkStack<>();

    // Split the input into words
    String[] words = input.toLowerCase().split("[^a-z']+");

    // Add the words to the queue and stack
    for (String word : words) {
      queue.enqueue(word);
      stack.push(word);
    }

    // Compare the words in the queue and stack
    while (!queue.isEmpty() && !stack.isEmpty()) {
      String word1 = queue.dequeue();
      String word2 = stack.pop();
      if (!word1.equals(word2)) {
        return false;
      }
    }

    // The input is a word-by-word palindrome
    return true;
  }

  public static void main(String[] args) {
    System.out.println(isPalindrome("You can cage a swallow, can't you, but, you can't swallow a cage, can you?"));
    System.out.println(isPalindrome("Herb the sage eats sage, the herb."));
    System.out.println(isPalindrome("Escher, drawing hands, drew hands drawing Escher."));
    System.out.println(isPalindrome("You know, I did little for you, for little did I know you."));
    System.out.println(isPalindrome("we shall prevail"));

  }
}
