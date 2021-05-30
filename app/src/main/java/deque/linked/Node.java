package deque.linked;

public class Node {
  Integer left;
  Integer right;
  int value;

  public Node(int value) {
    this(value, null, null);
  }

  public Node(int value, Integer left, Integer right) {
    this.left = left;
    this.right = right;
    this.value = value;
  }

}
