package deque.linked;

import java.util.NoSuchElementException;

public class LinkedDeque {

  Node front;
  Node back;

  public void pushFront(int value) {
    if (this.isEmpty()) {
      front = new Node(value);
      back = front;
      return;
    }

    front.left = new Node(value, null, front);
    front = front.left;
  }

  public void pushBack(int value) {
    if (this.isEmpty()) {
      front = new Node(value);
      back = front;
      return;
    }
    back.right = new Node(value, back, null);
    back = back.right;
  }

  public int popFront() {
    if (this.isEmpty()) {
      throw new NoSuchElementException();
    }

    Node node = front;
    front = front.right;

    if (front == null) {
      back = null;
    } else {
      front.left = null;
    }

    return node.value;
  }

  public int popBack() {
    if (this.isEmpty()) {
      throw new NoSuchElementException();
    }

    Node node = back;
    back = back.left;

    if (back == null) {
      front = null;
    } else {
      back.right = null;
    }

    return node.value;
  }

  public boolean isEmpty() {
    return front == null || back == null;
  }

  public String toString() {
    var result = new StringBuilder();
    result.append(this.getClass().getSimpleName() + " ");

    if (this.isEmpty()) {
      result.append("[ ]");
      return result.toString();
    }

    result.append("[ ");
    for (Node node = front; node != null; node = node.right) {
      result.append(node.value + " ");
    }
    result.append("]");

    return result.toString();
  }

  class Node {
    Node left;
    Node right;
    int value;

    public Node(int value) {
      this(value, null, null);
    }

    public Node(int value, Node left, Node right) {
      this.left = left;
      this.right = right;
      this.value = value;
    }

  }
}
