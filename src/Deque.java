import java.util.Iterator;

public class Deque<Item> implements Iterable<Item> {    
    private class Node {
	public Item item;
	public Node next;
	public Node pevious;
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
	return size() == 0;
    }
    
    public int size() {
	return size_;
    }
    
    public void addFirst(Item item) {
	if (item == null)
	    throw new java.lang.IllegalArgumentException();
	
	first_ = new Node();
	Node temp = first_;
	first_.item = item;
	first_.next = temp;
    }
    
    public void addLast(Item item) {
	if (item == null)
	    throw new java.lang.IllegalArgumentException();
    }
    public Item removeFirst() {
	if (first_ == null)
	    throw new java.util.NoSuchElementException();
	Node temp = first_;
	first_ = first_.previous;
	first_ = null;
    }
    public Item removesLast() {}
    public Iterator<Item> iterator() {
       return new DequeIterator();
    }
    private class DequeIterator implements Iterator<Item> {}
    
    public static void main(String[] args) {
       
    }
}
