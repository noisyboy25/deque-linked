package deque.linked;

public class App {
    public static void main(String[] args) {
        var deque0 = new LinkedDeque();
        System.out.println("Deque 0: " + deque0);

        var deque1 = new LinkedDeque();
        deque1.pushFront(1);
        System.out.println("Deque 1: " + deque1);

        var deque2 = new LinkedDeque();
        deque2.pushFront(0);
        deque2.pushFront(1);
        deque2.pushFront(2);
        deque2.pushFront(3);
        System.out.println("Deque 2: " + deque2);

        var deque3 = new LinkedDeque();
        deque3.pushFront(0);
        deque3.pushBack(1);
        deque3.pushBack(2);
        deque3.pushFront(3);
        deque3.pushBack(4);
        deque3.pushFront(5);
        System.out.println("Deque 3: " + deque3);

        var deque4 = new LinkedDeque();
        deque4.pushFront(0);
        deque4.pushBack(1);
        deque4.pushBack(2);
        deque4.pushFront(3);
        deque4.pushBack(4);
        deque4.pushFront(5);
        System.out.println("Deque 4: " + deque4);
        System.out.println("Deque 4 pop back: " + deque4.popBack());
        System.out.println("Deque 4 pop front: " + deque4.popFront());
        System.out.println("Deque 4: " + deque4);
    }
}
