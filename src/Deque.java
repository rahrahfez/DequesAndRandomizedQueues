import java.util.Iterator;

public class Deque<Item> implements Iterable<Item> {    
    private class Node {
	public Item item;
	public Node next;
	public Node previous;
    }
    
    private int size_ = 0;
    private Node head_ = null;
    private Node tail_ = null; 
    
    public Deque() {} // empty constructor    
    public boolean isEmpty() {
	return head_ == null;
    }    
    public int size() {
	if (head_.item == null)
	    return 0;
	return size_;
    }    
    public void addFirst(Item item) {
	if (item == null)
	    throw new java.lang.IllegalArgumentException();	
	
	if (isEmpty()) {
	    head_ = new Node();
	    head_.item = item;
	    size_++;
	}
	else {
	    Node temp = head_;
	    head_ = new Node();
	    head_.item = item;
	    head_.next = temp;
	    size_++;
	}
    }    
    public void addLast(Item item) {
	if (item == null)
	    throw new java.lang.IllegalArgumentException();
    }    
    public Item removeFirst() {
	if (head_.item == null)
	    throw new java.util.NoSuchElementException();
	
	Item temp = head_.item;
	head_.item = head_.next.item;
	head_.item = null;
	return temp;
    }
    public Item removesLast() {
	if (tail_.item == null)
	    throw new java.util.NoSuchElementException();

	return tail_.item;
    }
    public Iterator<Item> iterator() {
       return new DequeIterator();
    }
    
    private class DequeIterator implements Iterator<Item> {
	private Node current_ = head_;
	
	public boolean hasNext() {
	    return current_ != null;
	}
	public Item remove()
	    throw new java.lang.UnsupportedOperationException();
	public Item next() {
	    Item item = current_.item;
	    current_ = current_.next;
	    return item;
	}
    }
    
    public static void main(String[] args) {
	Deque<Integer> deck = new Deque<Integer>();
	deck.addFirst(4);
	deck.addFirst(10);
	deck.addFirst(20);
	deck.addFirst(15);
	deck.addFirst(2);

	Iterator it = deck.iterator();

	while (it.hasNext()) {   
	    System.out.println(it.next());
	}
	
	System.out.println(deck.size());
	
    }
}
