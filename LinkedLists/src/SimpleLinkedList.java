//Alyssa Zhang
//I'M USING CIRCULAR LISTS!!!!

public class SimpleLinkedList<E> implements SimpleList<E> {
    private int numElements;
    private  ListNode<E> head;

    @Override
    public int size() {
        return numElements;
    }

    @Override
    public void clear() {
        head = null;

        numElements = 0;
    }

    @Override
    public boolean isEmpty() {
        return numElements == 0;
    }

    @Override
    public E getFirst() {
        return head.data;
    }

    @Override
    public E getLast() {
        return head.prev.data;
    }

    @Override
    public void addFirst(E thing) {
        ListNode<E> newNode = new ListNode<>();
        if (numElements == 0){
            newNode = head;
        }
        ListNode<E> oldHead = head;
        newNode.data = thing;
        newNode.next = oldHead;
        newNode.prev = oldHead.prev;
        oldHead.prev.next = newNode;
        oldHead.prev = newNode;
        head = newNode;
        numElements += 1;
    }

    @Override
    public void addLast(E thing) {
        ListNode<E> newNode = new ListNode<>();
        newNode.data = thing;
        if (numElements == 0){
            head = newNode;
            newNode.next = newNode;
            newNode.prev = newNode;
        }
        else{
            newNode.next = head;
            newNode.prev = head.prev;
            head.prev = newNode;
            newNode.prev.next = newNode;

        }
        numElements += 1;

    }

    @Override
    public E removeFirst() {
        return remove(0);
    }

    @Override
    public E removeLast() {
        return remove(numElements - 1);
    }

    @Override
    public boolean add(E thing) {
        addLast(thing);
        if (head.prev.data == thing){
            return true;
        }
        else{
            return false;
        }
    }

    @Override
    public void add(int index, E thing) {
        if (index <0 || index > numElements){
            throw new IndexOutOfBoundsException("The index must never be negative or greater than the number of elements!");
        }
        ListNode<E> newNode = new ListNode<>();
        newNode.data = thing;

        if (numElements == 0){
            head = newNode;
        }
        else{
            ListNode<E> oldNode = getNode(index);
            newNode.prev = oldNode.prev;
            newNode.next = oldNode;
            oldNode.prev.next = newNode;
            oldNode.prev = newNode;
        }

    }

    public ListNode<E> getNode(int index){
        ListNode<E> listNode = head;
        for (int listindex = 0; listindex < index; listindex += 1){
            listNode = listNode.next;
        }
        return listNode;
    }

    @Override
    public E get(int index) {
        if (index <0 || index >= numElements){
            throw new IndexOutOfBoundsException("The index must never be negative or greater than the number of elements!");
        }
        return getNode(index).data;
    }

    @Override
    public E set(int index, E thing) {
        getNode(index);
        thing = getNode(index).data;
        return thing;
    }

    @Override
    public E remove(int index) {
        if (index <0 || index > numElements){
            throw new IndexOutOfBoundsException("The index must never be negative or greater than the number of elements!");
        }
        ListNode<E> removedNode;
        removedNode = getNode(index);
        removedNode.prev.next = removedNode.next;
        removedNode.next.prev = removedNode.prev;

        if(removedNode == head){
            head = head.next;
        }
        numElements -= 1;
        return removedNode.data;
    }

    @Override
    public int indexOf(E thing) {
        ListNode<E> listNode = head;
        int listIndex;
        for (listIndex = 0; listIndex < size(); listIndex += 1){
            listNode = listNode.next;
            if (listNode.data == thing){
                return listIndex;
            }
        }
        return -1;
    }

    @Override
    public boolean contains(E thing) {
        return indexOf(thing) >= 0;
    }
}

/*
 ---------------_---"Hi Andrew!"---
 --------------| |---/-------------
 ------------___|___/--------------
 -----------/---|------------------
 ----------/---| |-----------------
 --------------|-|-----------------
 */