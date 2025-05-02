public class LinkedList {
    public Node head;
    public Node tail;
    public int length;

    public LinkedList() {
    
    }
    public Node getFront() {
        return head;
    }
    public int getLength() {
        return length;
    }
    public void append(Node node) {
        if (length > 0)
        {
            tail.setNext(node);
        }
        else
        {
            head = node;
        }
        tail = node;
        length++;
    }
    public void insert(Node node, int index) {
        Node current = head;

        if (index >= length) {
            index = length;
        }

        if (index >= 0)
        {
            for (int i = 1; i < index; i++)
            {
                current = current.getNext();
            }

            if (index == 0)
            {
                node.setNext(head);
                head = node;
            }
            else
            {
                node.setNext(current.getNext());
                current.setNext(node);
            }

            length++;
        }
    }
    public Node remove(int index) {
        Node current = head;
        Node toRemove = head;

        if (index >= 1)
        {
            toRemove = head.getNext();
        }

        if (index < length && index >= 0)
        {
            for (int i = 1; i < index; i++)
            {
            current = current.getNext();
            toRemove = toRemove.getNext();
            }

            if (index == 0)
            {
                Node next = head.getNext();
                head.setNext(null);
                head = next;
            }
            else
            {
                current.setNext(toRemove.getNext());
                toRemove.setNext(null);

                if (index == length - 1)
                {
                    tail = current;
                }
            }

            length--;
            return toRemove;
        }

        return null;
    }
    public String toString() {
        String result = "";
        Node current = head;

        if (length == 0) {
            return "There are no items in this list.";
        }

        for (int i = 0; i < length; i++)
        {
            result += "Index: " + i + " Data: " + current.getData() + "\n";
            current = current.getNext();
        }

        return result;
    }
}
