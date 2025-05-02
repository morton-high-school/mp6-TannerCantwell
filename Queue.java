public class Queue {
    private LinkedList queueList;
    
    public Queue() {
        this.queueList = new LinkedList();
    }
    public void add(Node item) {
        queueList.append(item);
    }
    public Node remove() {
        Node removeNode = queueList.remove(0);
        
        return removeNode;
    }
    public Node peek() {
        return LinkedListUtil.getNode(queueList, 0);
    }
    public boolean empty() {
        if (LinkedListUtil.length(queueList) == 0) {
            return true;
        } else {
            return false;
        }
    }
    public int search(Node item) {
        int position = LinkedListUtil.search(queueList, item.getData());
        if (position >= 0)
        {
            return LinkedListUtil.length(queueList) - position;
        }
        return position;
    }
}
