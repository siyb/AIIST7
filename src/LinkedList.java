public class LinkedList<T> {

    public Node<T> startNode = null;

    public void add(T o) {
        if (o == null) throw new NullPointerException();
        if (startNode == null) {
            startNode = new Node<>(o);
            return;
        }
        Node<T> currentNode = startNode;
        while (currentNode.next != null) {
            currentNode = currentNode.next;
        }
        currentNode.next = new Node<>(o);
    }

    public int size() {
        int size = 0;
        Node<T> currentNode = startNode;
        while (currentNode != null) {
            size++;
            currentNode = currentNode.next;
        }
        return size;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        Node<T> currentNode = startNode;
        while (currentNode != null) {
            result.append(currentNode.content.toString()).append(", ");
            currentNode = currentNode.next;
        }
        return result.toString();
    }

    public static class Node<S> {
        private S content;
        private Node<S> next;

        public Node(S content) {
            this.content = content;
        }
    }
}
