public class NQueen {
  public static String printQueenStack(LinkStack<Integer> R) {
    String chessB = "";
    int boardDimension = R.size();
    Integer[] board = new Integer[boardDimension];
    int index = 0;
    while (!R.isEmpty()) {
      board[index++] = R.pop();
    }
    for (int row = 0; row < boardDimension; row++) {
      for (int col = 0; col < boardDimension; col++) {
        if (board[row] == col + 1) {
          chessB += "Q";
        } else {
          chessB += "_";
        }
      }
      chessB += "\n";
    }
    return chessB;
  }

  public static LinkStack<Integer> copyStack(LinkStack<Integer> F) {
    LinkStack<Integer> copy = new LinkStack<>();
    int[] tempS = new int[F.size()];
    for (int i = F.size(); i > 0; i--) {
      tempS[i - 1] = F.pop();
    }
    for (int i = tempS.length - 1; i >= 0; i--) {
      F.push(tempS[i]);
      copy.push(tempS[i]);
    }
    return copy;
  }

  public static boolean checkConflict(int pos, LinkStack<Integer> S) {
    boolean answer = false;
    int currRowID = S.size() + 1;
    int prevRowID = currRowID - 1;
    LinkStack<Integer> tempStack = copyStack(S);
    for (int i = S.size(); i > 0; i--) {
      int prevPos = tempStack.pop();
      if ((currRowID - prevRowID) == (Math.abs(pos - prevPos)) || (pos == prevPos)) {
        answer = true;
        break;
      }
      prevRowID--;
    }
    return answer;
  }

  public static void queenBoard(int N) {
    if (N > 16 || N < 1) {
      System.out.println("Input out of range");
      return;
    }
    LinkStack<Integer> queenPos = new LinkStack<>();

    int Qpos = 1;
    while (queenPos.size() < N) {
      while (Qpos <= N) {
        if (!checkConflict(Qpos, queenPos)) {
          queenPos.push(Qpos);
          Qpos = 1;
          break;
        } else {
          Qpos++;
        }
      }
      if (Qpos > N && !queenPos.isEmpty()) {
        Qpos = queenPos.pop() + 1;
      } else if (queenPos.isEmpty() && Qpos > N) {
        System.out.println("No solution");
        return;
      }
    }

    System.out.println(printQueenStack(queenPos));

  }

  public static void main(String[] args) {
    System.out.println("Test Case 1: N = 4\n");
    queenBoard(4);
    System.out.println("----------------------------\n");

    System.out.println("Test Case 2: N = 8\n");
    queenBoard(8);
    System.out.println("----------------------------\n");

    System.out.println("Test Case 3: N = 2\n");
    queenBoard(2);
    System.out.println("----------------------------\n");

    System.out.println("Test Case 4: N = 16\n");
    queenBoard(16);
    System.out.println("----------------------------\n");

    System.out.println("Test Case 5: N = 3\n");
    queenBoard(3);
    System.out.println("----------------------------\n");

    System.out.println("Test Case 6: N = 20\n");
    queenBoard(20);
    System.out.println("----------------------------\n");

    System.out.println("Test Case 7: N = 25\n");
    queenBoard(25);
    System.out.println("----------------------------\n");
  }
}
