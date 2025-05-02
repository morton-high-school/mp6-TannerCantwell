public class LinkedListAutograder{
  public static void main(String[] args){
    nodeTests();
    linkedListTests();
    linkedListUtilTests();
    stackTests();
    queueTests();
  }

  public static void nodeTests(){
    Node a1 = new Node(5);
    boolean t1 = a1.getNext()==null;
    boolean t2 = a1.getData()==5;

    Node a2 = new Node(7);
    a1.setNext(a2);
    boolean t3 = a1.getNext()==a2;

    if(!t1){
      System.out.println("Failed Node Test 1.");
    }
    if(!t2){
      System.out.println("Failed Node Test 2.");
    }
    if(!t3){
      System.out.println("Failed Node Test 3.");
    }
    if(t1&&t2&&t3){
      System.out.println("Passed all Node Tests.");
    }
  }

  public static void linkedListTests(){
    LinkedList a1 = new LinkedList();
    Node a2 = a1.getFront();
    boolean t1 = a2==null;
    boolean t2 = a1.toString().equals("There are no items in this list.");

    Node a3 = new Node(3);
    Node a4 = new Node(4);
    Node a5 = new Node(5);
    Node a6 = new Node(6);
    Node a7 = new Node(7);

    a1.append(a3);
    boolean t3 = a1.toString().equals("Index: 0 Data: 3\n");
    a1.append(a4);
    a1.insert(a5, 0);
    boolean t4 = a1.toString().equals("Index: 0 Data: 5\nIndex: 1 Data: 3\nIndex: 2 Data: 4\n");
    a1.insert(a6,10);
    boolean t5 = a1.toString().equals("Index: 0 Data: 5\nIndex: 1 Data: 3\nIndex: 2 Data: 4\nIndex: 3 Data: 6\n");
    a1.insert(a7,2);
    boolean t6 = a1.toString().equals("Index: 0 Data: 5\nIndex: 1 Data: 3\nIndex: 2 Data: 7\nIndex: 3 Data: 4\nIndex: 4 Data: 6\n");

    a1.remove(10);
    boolean t7 = a1.toString().equals("Index: 0 Data: 5\nIndex: 1 Data: 3\nIndex: 2 Data: 7\nIndex: 3 Data: 4\nIndex: 4 Data: 6\n");
    a1.remove(3);
    boolean t8 = a1.toString().equals("Index: 0 Data: 5\nIndex: 1 Data: 3\nIndex: 2 Data: 7\nIndex: 3 Data: 6\n");
    a1.remove(0);
    boolean t9 = a1.toString().equals("Index: 0 Data: 3\nIndex: 1 Data: 7\nIndex: 2 Data: 6\n");

    if(!t1){
      System.out.println("Failed Linked List Test 1.");
    }
    if(!t2){
      System.out.println("Failed Linked List Test 2.");
    }
    if(!t3){
      System.out.println("Failed Linked List Test 3.");
    }
    if(!t4){
      System.out.println("Failed Linked List Test 4.");
    }
    if(!t5){
      System.out.println("Failed Linked List Test 5.");
    }
    if(!t6){
      System.out.println("Failed Linked List Test 6.");
    }
    if(!t7){
      System.out.println("Failed Linked List Test 7.");
    }
    if(!t8){
      System.out.println("Failed Linked List Test 8.");
    }
    if(!t9){
      System.out.println("Failed Linked List Test 9.");
    }
    if(t1&&t2&&t3&&t4&&t5&&t6&&t7&&t8&&t9){
      System.out.println("Passed all Linked List Tests.");
    }
  }

  public static void linkedListUtilTests(){
    LinkedList a1 = new LinkedList();
    LinkedList a2 = new LinkedList();
    LinkedList a3 = new LinkedList();
    LinkedList a4 = new LinkedList();

    Node b1 = new Node(1);
    Node b2 = new Node(2);
    Node b3 = new Node(3);
    Node b4 = new Node(4);
    Node b5 = new Node(5);
    Node b12 = new Node(2);
    Node b22 = new Node(2);

    Node b11 = new Node(1);
    Node b32 = new Node(2);
    Node b13 = new Node(3);
    Node b14 = new Node(4);
    Node b15 = new Node(5);
    Node b42 = new Node(2);
    Node b52 = new Node(2);

    a2.append(b1);
    a2.append(b2);
    a2.append(b3);
    a2.append(b4);
    a2.append(b5);
    a2.append(b12);
    a2.append(b22);

    boolean t1 = LinkedListUtil.length(a1)==0;
    boolean t2 = LinkedListUtil.length(a2)==7;
    boolean t3 = LinkedListUtil.search(a2, 3)==2;
    boolean t4 = LinkedListUtil.search(a2, 10)==-1;
    boolean t5 = LinkedListUtil.getNode(a2, 3).getData()==4;
    boolean t6 = LinkedListUtil.getNode(a2, 10)==null;
    boolean t7 = LinkedListUtil.count(a2,10)==0;
    boolean t8 = LinkedListUtil.count(a2,2)==3;

    a3.append(b11);
    a3.append(b32);
    a3.append(b13);
    a3.append(b14);
    a3.append(b15);

    boolean t9 = !LinkedListUtil.compare(a2,a3);

    a3.append(b42);
    a3.append(b52);

    boolean t10 = LinkedListUtil.compare(a2,a3);

    Node b21 = new Node(1);
    Node b62 = new Node(2);
    Node b23 = new Node(3);
    Node b24 = new Node(4);
    Node b25 = new Node(5);
    Node b72 = new Node(2);
    Node b82 = new Node(2);

    a4.append(b82);
    a4.append(b72);
    a4.append(b25);
    a4.append(b24);
    a4.append(b23);
    a4.append(b62);
    a4.append(b21);

    LinkedList a5 = LinkedListUtil.reverse(a2);

    boolean t11 = LinkedListUtil.compare(a2, a3);
    boolean t12 = LinkedListUtil.compare(a4, a5);

    if(!t1){
      System.out.println("Failed Linked List Util Test 1.");
    }
    if(!t2){
      System.out.println("Failed Linked List Util Test 2.");
    }
    if(!t3){
      System.out.println("Failed Linked List Util Test 3.");
    }
    if(!t4){
      System.out.println("Failed Linked List Util Test 4.");
    }
    if(!t5){
      System.out.println("Failed Linked List Util Test 5.");
    }
    if(!t6){
      System.out.println("Failed Linked List Util Test 6.");
    }
    if(!t7){
      System.out.println("Failed Linked List Util Test 7.");
    }
    if(!t8){
      System.out.println("Failed Linked List Util Test 8.");
    }
    if(!t9){
      System.out.println("Failed Linked List Util Test 9.");
    }
    if(!t10){
      System.out.println("Failed Linked List Util Test 10.");
    }
    if(!t11){
      System.out.println("Failed Linked List Util Test 11.");
    }
    if(!t12){
      System.out.println("Failed Linked List Util Test 12.");
    }
    if(t1&&t2&&t3&&t4&&t5&&t6&&t7&&t8&&t9&&t10&&t11&&t12){
      System.out.println("Passed all Linked List Util Tests.");
    }
  }

  public static void stackTests(){
    Stack a1 = new Stack();
    Node b1 = new Node(1);
    Node b2 = new Node(2);
    Node b3 = new Node(3);
    Node b4 = new Node(1);

    boolean t1 = a1.empty();

    a1.push(b1);
    a1.push(b2);
    a1.push(b3);

    boolean t2 = a1.peek().getData()==3;
    boolean t3 = a1.pop().getData()==3;
    boolean t4 = !a1.empty();

    a1.push(b4);

    boolean t5 = a1.search(b1)==2;
    boolean t6 = a1.search(b3)==-1;

    if(!t1){
      System.out.println("Failed Stack Test 1.");
    }
    if(!t2){
      System.out.println("Failed Stack Test 2.");
    }
    if(!t3){
      System.out.println("Failed Stack Test 3.");
    }
    if(!t4){
      System.out.println("Failed Stack Test 4.");
    }
    if(!t5){
      System.out.println("Failed Stack Test 5.");
    }
    if(!t6){
      System.out.println("Failed Stack Test 6.");
    }
    if(t1&&t2&&t3&&t4&&t5&&t6){
      System.out.println("Passed all Stack Tests.");
    }
  }

  public static void queueTests(){
    Queue a1 = new Queue();
    Node b1 = new Node(1);
    Node b2 = new Node(2);
    Node b3 = new Node(3);
    Node b4 = new Node(3);

    boolean t1 = a1.empty();

    a1.add(b1);
    a1.add(b2);
    a1.add(b3);

    boolean t2 = a1.peek().getData()==1;
    boolean t3 = a1.remove().getData()==1;
    boolean t4 = !a1.empty();

    a1.add(b4);

    boolean t5 = a1.search(b4)==2;
    boolean t6 = a1.search(b1)==-1;

    if(!t1){
      System.out.println("Failed Queue Test 1.");
    }
    if(!t2){
      System.out.println("Failed Queue Test 2.");
    }
    if(!t3){
      System.out.println("Failed Queue Test 3.");
    }
    if(!t4){
      System.out.println("Failed Queue Test 4.");
    }
    if(!t5){
      System.out.println("Failed Queue Test 5.");
    }
    if(!t6){
      System.out.println("Failed Queue Test 6.");
    }
    if(t1&&t2&&t3&&t4&&t5&&t6){
      System.out.println("Passed all Queue Tests.");
    }
  }
}
