package linkedlist_method;

public class MyLinkedList<E> {
    private class Node {
        private Node next;
        private Object data;

        public Node(Object data) {
            this.data = data;
        }

        public Object getData() {
            return this.data;
        }
    }

    //Phần tử đầu tiên của danh sách liên kết
    private Node head;
    //Số lượng phần tử có trong danh sách
    private int size = 0;

    public MyLinkedList() {

    }

    public void addFirst(E data) {
        if (head == null) {
            head = new Node(data);
        } else {
            Node temp = head;
            head = new Node(data);
            head.next = temp;
        }
        //Khai báo 1 biến là temp tham chiếu(trỏ) đến giá trị của head
//        Node temp = head;
//        Biến head sẽ nhận được giá trị là 1 node mới
//        head = new Node(element);
//        head.next trỏ đến temp
//        head.next = temp;
        size++;
    }

    public void addLast(E data) {
        if (head == null) {
            addFirst(data);
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = new Node(data);
        }
        //Khai báo biến temp trỏ đến head
        size++;
    }

    public void add(int index, E data) {
        Node temp = head;
        Node holder;
        for (int i = 0; i < index - 1 && temp.next != null; i++) {
            temp = temp.next;
        }
        holder = temp.next;
        temp.next = new Node(data);
        temp.next.next = holder;
        size++;
    }


    public Object get(int index) {
        //Khai báo biến temp trỏ tới head
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp.data;
    }

    public int size() {
        return size;
    }

    public E remove(int index) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Error index" + index);
        }
        //Khai báo biến temp trỏ đến head
        Node temp = head;
        Object data;
        //Nếu index = 0 thì trả về data hiện tại
        if (index == 0) {
            data = temp.data;
            head = head.next;
            size--;
        } else {
            for (int i = 0; i < index - 1 && temp.next != null; i++) {
                temp = temp.next;
            }
            data = temp.next.data;
            temp.next = temp.next.next;
            size--;
        }
        return (E) data;
    }

    public boolean remove(E element) {
        //Remove đối tượng nếu element head
        if (head.data.equals(element)) {
            remove(0);
            return true;
        } else {
            //Khai báo 1 node temp trỏ đến head
            Node temp = head;
            while (temp.next != null) {
                //Nếu như tồn tại 1 phần tử có data bằng data truyền vào thì node đó sẽ bị remove
                if (temp.next.data.equals(element)) {
                    temp.next = temp.next.next;
                    size--;
                    return true;
                }
            }
        }
        return false;
    }

    public MyLinkedList<E> clone() {
        //Kiểm tra linkedlist có phần tử hay không
        if (size == 0) {
            throw new IndexOutOfBoundsException("Linkedlist is null");
        }
        //Khai báo Linkedlist trả về
        MyLinkedList<E> returnLinkedlist = new MyLinkedList<>();
        //Khai báo 1 temp trỏ đến head
        Node temp = head;
        //add temp vào danh sách để nó làm head
        returnLinkedlist.addFirst((E) temp.data);
        temp = temp.next;
        while (temp != null) {
            returnLinkedlist.addLast((E) temp.data);
            temp = temp.next;
        }
        return returnLinkedlist;
    }

    public boolean contains(E element) {
        Node tempt = head;
        while (tempt != null) {
            if (tempt.data.equals(element)) {
                return true;
            }
            tempt = tempt.next;
        }
        return false;
    }

    public int indexOf(E element) {
        Node temp = head;
        for (int i = 0; i < size; i++) {
            if (temp.getData().equals(element)) {
                return 1;
            }
            temp = temp.next;
        }
        return -1;
    }

    public void printlist() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }

    }

}
