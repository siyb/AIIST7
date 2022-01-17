/**
 * A list containing objects of type {@link T}
 * @param <T> The type of elements in the list
 */
public class LinkedList<T> {

    /**
     * The start node of this list, container for objects of type {@link T}
     */
    public Node<T> startNode = null;

    /**
     * Adds an item to the list
     * @param o the item to add
     */
    public void add(T o) {
        if (o == null) throw new NullPointerException();
        // if the list does not have a startNode yet, i.e. if there are no items in the list, create the start node
        // containing the passed value and return
        if (startNode == null) {
            startNode = new Node<>(o);
            return;
        }

        // loop over all nodes of this list by visiting the next node in line until the end of the list is reached
        // (next == null)
        Node<T> currentNode = startNode;
        while (currentNode.next != null) {
            // move the currentNode reference to the next node in line, traversing the list in its entirety
            // util the end of the list has been reached
            currentNode = currentNode.next;
        }

        // create a new node and set it as the "next" node of the last node in the list
        currentNode.next = new Node<>(o);
    }

    public int size() {
        int size = 0;
        // traverse the entire list until the end is reached (currentNode == null), incrementing a counter in each
        // iteration
        Node<T> currentNode = startNode;
        while (currentNode != null) {
            size++;
            currentNode = currentNode.next;
        }
        return size;
    }

    @Override
    public String toString() {
        // the builder that we use to build our string
        StringBuilder result = new StringBuilder();
        // traverse the list (see methods above for more detail!) ...
        Node<T> currentNode = startNode;
        while (currentNode != null) {
            // append the string representation of the current node to the result string
            result.append(currentNode.content.toString()).append(", ");
            // move to next node
            currentNode = currentNode.next;
        }
        // return the result string
        return result.toString();
    }

    /**
     * A node holding a value of the list. Note that this is a static inner class, meaning that it does not have access
     * to its enclosing context.
     * @param <S> The type of the value held
     */
    public static class Node<S> {
        /**
         * The actual content of the node
         */
        private S content;
        /**
         * A reference to the next node in the list
         */
        private Node<S> next;

        /**
         * Default constructor
         * @param content the content
         */
        public Node(S content) {
            this.content = content;
        }
    }
}
