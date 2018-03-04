import java.util.Iterator;

public class Deque<Item> implements Iterable<Item> {
    private class Node {
	private Item item;
	private Node next_;
	private Node pevious_;
    }
    
    private int size_;
    
    public Deque() {
	size_ = 0;
    }
    
    public boolean isEmpty() {
	return size() == 0;
    }
    
    public int size() {
	return size_;
    }
    
    public void addFirst(Item item) {}
    public void addLast(Item item) {}
    //public Item removeFirst();
    //public Item removesLast();
    public Iterator<Item> iterator() {
	return new DequeIterator();
    }
    private class DequeIterator implements Iterator<Item> {}
  public static void main(String[] args) {
      System.out.println("Deque.java");
  }
}
