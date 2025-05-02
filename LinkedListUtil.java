public class LinkedListUtil {

    public static int length(LinkedList value) {
        return value.getLength();
    }
    public static int search(LinkedList value, int data) {
        Node current = value.getFront();

        for (int i = 0; i < length(value); i++)
        {
            if (current.getData() == data) {
                return i;
            }
            current = current.getNext();
        }

        return -1;
    }
    public static Node getNode(LinkedList value, int index) {
        if (index >= 0 && index < length(value)) {
            Node current = value.getFront();

            for (int i = 0; i < length(value); i++)
            {
                if (i == index) {
                    return current;
                }

                current = current.getNext();
            }
        }
        
        return null;
    }
    public static int count(LinkedList value, int data) {
        Node current = value.getFront();
        int dataCount = 0;

        for (int i = 0; i < length(value); i++)
        {
            if (current.getData() == data) {
                dataCount++;
            }
            current = current.getNext();
        }

        return dataCount;
    }
    public static boolean compare(LinkedList value1, LinkedList value2) { // FIX NOTE: This checks if both lists contain the same items. They DON'T have to be in the same order.
        if (length(value1) == length(value2)) {    
            Node current1 = value1.getFront();
            boolean v1 = true;
            boolean v2 = true;

            for (int i = 0; i < length(value1); i++)
            {
                if (search(value2, current1.getData()) == -1) {
                    v1 = false;
                }

                current1 = current1.getNext();
            }

            Node current2 = value2.getFront();

            for (int i = 0; i < length(value2); i++)
            {
                if (search(value1, current2.getData()) == -1) {
                    v2 = false;
                }

                current2 = current2.getNext();
            }
            
            if (v1 || v2) {
                return true;
            } 
        }
        return false;
    }
    public static LinkedList reverse(LinkedList value) {
        LinkedList result = new LinkedList();
        Node current = value.getFront();

        for (int i = 0; i < length(value); i++)
        {
            Node newNode = new Node(current.getData());
            result.insert(newNode, 0);
        }

        return result;
    }
}
