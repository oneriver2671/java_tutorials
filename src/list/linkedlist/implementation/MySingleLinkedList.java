package list.linkedlist.implementation;


public class MySingleLinkedList<T> {
	
	public Node<T> head;
	public int size;
	
	public MySingleLinkedList() {	
		head = null;
		size = 0;
	}
	
	public void addFirst(T item) {
		Node<T> newNode = new Node<T>(item);
		newNode.next = head;	
		head = newNode;		
		size++;		
	}
	public void addAfter(Node<T> before, T item) {
		Node<T> temp = new Node<T>(item);
		temp.next = before.next;		
		before.next = temp;			
		size++;
	}
	
	public T removeFirst() {		// void�� ���⵵ �ϰ� ���� return�ϱ⵵ �ϰ�.
		if(head == null) {
			return null;
		} else {
			T temp = head.data;		// ������ ��� ������ ���. (������ ����)
			head = head.next;
			return temp;		// ������ ����� �����͸� �������ִ� ��. (�ʼ��� �ƴ�.)
		}
	}
	
	public T removeAfter(Node<T> before) {
		if(before.next == null) {
			return null;
		} else { 
			T temp = before.next.data;		// ������ ����� ������ ���.
			before.next = before.next.next;
			return temp;
		}
	}
	
	public int indexOf(T item) {		// search
		Node<T> p = head;	// head�� ���� �����ؼ� �־��� ��.
		int index = 0;
		while(p != null) {
			if(p.data.equals(item))
				return index;
			p = p.next;
			index++;
		}
		return -1;
	}
	
	public Node<T> getNode(int index){
		if(index < 0 || index >= size)		// index�� ��ȿ�� �˻縦 ����.
			return null;
			Node<T> p = head;
			for(int i=0; i<index; i++) 
				p = p.next;
				return p;
	}
	
	public T get(int index) {
		if(index < 0 || index >= size)   // ���� �� ���� ����а���. null���� ���� ����.		
			return null;
//			Node<T> p = head;
//			for(int i=0; i<index; i++) 
//				p = p.next;
//				return p;
		return getNode(index).data;		// �̷��� �� �ٷ� �ϸ� ����. getNode���� ����������.
	}
	
	public void add(int index, T item) {		// insert
		
		if(index < 0 || index > size)		// index ��ȿ�� �˻�.
			return;		// �̷� ���̽��� �� ����ó���ؼ� throws �ϴ°� ������, ���߿� �غ���. 
		if(index == 0) {
			addFirst(item);
		} else {
			Node<T> q = getNode(index-1);
			addAfter(q, item);
			}
	}
	
	public T remove(int index) {			// delete
		
		if(index < 0 || index >= size)
			return null;
		if(index==0) {
			return removeFirst();
		} else {
		Node<T> prev = getNode(index-1);
		return removeAfter(prev);
		}
	}
	
	
	
	
	
	
	public static void main(String[] args) {
		MySingleLinkedList<String> list = new MySingleLinkedList<>();
		list.add(0, "Saturday");
		list.add(1, "Friday");
		list.add(0, "Monday");		// M -> S -> F
		list.add(2, "Tuesday");		// M -> S -> T -> F
				
		
		String str = list.get(2);		// str = "Tuesday"
		list.remove(2);			// M -> S -> F
		int pos = list.indexOf("Friday");		// pos = 2
	}
}
