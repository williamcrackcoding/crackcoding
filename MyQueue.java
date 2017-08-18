import java.util.*;

public class MyQueue<T> {
	
	private static class Node<T> {
		private T data;
		private Node<T> next;
		
		public Node(T data) {
			this.data = data;
		}
	}
	
	private Node<T> first, last;
	
	public void add(T item) {
		Node<T> t = new Node<T>(item);
		if (last != null) {
			last.next = t;
		} 
		last = t;
		if (first == null) {
			first = last;
		}		
	}
	
	public void remove() {
		if (first == null) {
			System.out.println("The queue is empty");
		}
		first = first.next;
		if (first == null) {
			last=null;
		}
	}
	
	public T peek() {
		if (first == null) throw new NoSuchElementException();
		return first.data;
	}
	
	public boolean isEmpty() {
		return first == null;
	}

}
