public class LinkedListUc5<T> {

	private LinkedListNode<T> first = null;
	//inserting into linkedlist
        public void insertNode(LinkedListNode<T> node) {
		node.setNext(first);
		first = node;
	}

	public void removeNode(){
		if(first.getNext()!=null)
			first = first.getNext();
		else first = null;
	}
	
	private void printList(LinkedListNode<T> node) {
		System.out.print(node.getValue()+"->");
		if(node.getNext()!=null) printList(node.getNext());
	}

	public void print(){
		printList(first);
	}
	
	
	public static void main(String[] args) {
		LinkedListUc5<Integer> list = new LinkedListUc5<>();
		list.insertNode(new LinkedListNode<Integer>(70));
		list.insertNode(new LinkedListNode<Integer>(30));
		list.insertNode(new LinkedListNode<Integer>(56));
		list.print();
		list.removeNode();
		System.out.println("After removing the head node linked list is");
		list.print();
	}

}

class LinkedListNode<T> {
	private T value;
	private LinkedListNode<T> next;

	public LinkedListNode(T value) {
		this.value = value;
	}

	public void setNext(LinkedListNode<T> next) {
		this.next = next;
	}

	public LinkedListNode<T> getNext() {
		return next;
	}

	public T getValue() {
		return value;
	}
}
