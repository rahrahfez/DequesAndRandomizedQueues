import java.util.Iterator;

public class Deque<Item> implements Iterable<Item> {    
    private class Node {
	public Item item;
	public Node next;
	public Node previous;
    }
    
    private int size_;
    private Node first_;
    private Node last_;
    
    public Deque() {
	size_ = 0;
	first_ = null;
	last_ = null;
    }    
    public boolean isEmpty() {
	return first_ == null;
    }    
    public int size() {
	if (first_.item == null)
	    return 0;
	Node current = first_;
	while (current != null) {
	    size_++;
	    current = current.next;
	}
	return size_;
    }    
    public void addFirst(Item item) {
	if (item == null)
	    throw new java.lang.IllegalArgumentException();

	if (first_.item == null) 
	    first_.item = item;	

	Node temp = first_;
	first_ = new Node();
	first_.item = item;
	first_.next = temp;
    }    
    public void addLast(Item item) {
	if (item == null)
	    throw new java.lang.IllegalArgumentException();
    }    
    public Item removeFirst() {
	if (first_.item == null)
	    throw new java.util.NoSuchElementException();
	
	Item temp = first_.item;
	first_.item = first_.next.item;
	first_.item = null;
	return temp;
    }
    public Item removesLast() {
	if (last_.item == null)
	    throw new java.util.NoSuchElementException();

	return last_.item;
    }
    public Iterator<Item> iterator() {
       return new DequeIterator();
    }
    
    private class DequeIterator implements Iterator<Item> {
	private Node current_ = first_;
	
	public boolean hasNext() {
	    return current_ != null;
	}
	public Item next() {
	    Item item = current_.item;
	    current_ = current_.next;
	    return item;
	}
    }
    
    public static void main(String[] args) {
	

    }
}
