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
	
	public T removeFirst() {		// void로 쓰기도 하고 뭔갈 return하기도 하고.
		if(head == null) {
			return null;
		} else {
			T temp = head.data;		// 삭제될 노드 데이터 담기. (리턴을 위해)
			head = head.next;
			return temp;		// 삭제된 노드의 데이터를 리턴해주는 것. (필수는 아님.)
		}
	}
	
	public T removeAfter(Node<T> before) {
		if(before.next == null) {
			return null;
		} else { 
			T temp = before.next.data;		// 삭제될 노드의 데이터 담기.
			before.next = before.next.next;
			return temp;
		}
	}
	
	public int indexOf(T item) {		// search
		Node<T> p = head;	// head의 값을 복사해서 넣어준 것.
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
		if(index < 0 || index >= size)		// index의 유효성 검사를 위해.
			return null;
			Node<T> p = head;
			for(int i=0; i<index; i++) 
				p = p.next;
				return p;
	}
	
	public T get(int index) {
		if(index < 0 || index >= size)   // 위에 두 줄은 살려둔거임. null값일 때를 위해.		
			return null;
//			Node<T> p = head;
//			for(int i=0; i<index; i++) 
//				p = p.next;
//				return p;
		return getNode(index).data;		// 이렇게 한 줄로 하면 편함. getNode에서 구현했으니.
	}
	
	public void add(int index, T item) {		// insert
		
		if(index < 0 || index > size)		// index 유효성 검사.
			return;		// 이런 케이스일 땐 예외처리해서 throws 하는게 맞지만, 나중에 해보자. 
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
