package list.linkedlist.implementation;

public class LinkedList {
    // ù��° ��带 ����Ű�� �ʵ�
    private Node head;
    private Node tail;
    private int size = 0;
    private class Node{
        // �����Ͱ� ����� �ʵ�
        private Object data;
        // ���� ��带 ����Ű�� �ʵ�
        private Node next;
        public Node(Object input) {
            this.data = input;
            this.next = null;
        }
        // ����� ������ ���� ����ؼ� Ȯ���غ� �� �ִ� ���
        public String toString(){
            return String.valueOf(this.data);
        }
    }
}