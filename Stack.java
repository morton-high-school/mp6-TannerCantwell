public class Stack {
    private LinkedList stackList;

    public Stack() {
        this.stackList = new LinkedList();
    }
    public void push(Node item) {
        stackList.append(item);
    }
    public Node pop() {
        return(stackList.remove(LinkedListUtil.length(stackList) - 1));
    }
    public Node peek() {
        return(LinkedListUtil.getNode(stackList, LinkedListUtil.length(stackList) - 1));
    }
    public boolean empty() {
        if (LinkedListUtil.length(stackList) == 0) {
            return true;
        } else {
            return false;
        }
    }
    public int search(Node item) {
        int position = LinkedListUtil.search(stackList, item.getData());
        if (position >= 0)
        {
            return LinkedListUtil.length(stackList) - position - 1;
        }
        return position;
    }
}
