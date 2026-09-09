//Queues using LinkedList

package Queue;

class Queues_Using_LinkedList {
	static class Node{
		int data;
		Node next;
		Node(int data){
			this.data = data;
		}
	}
	private Node front ;
	private Node rear;
	
	void enqueue(int value) {
		Node newNode = new Node(value);
		if(rear == null) {
			front = rear = newNode;
			return;
		}
		rear.next = newNode;
		rear = newNode;
	}
	int dequeue() {
		if(front == null) {
			return -1;
		}
		int value = front.data;
		front = front.next;
		if(front == null) {
			rear = null;
		}
		return value;
	}
	int peek() {
		if(front == null) {
			return -1;
		}
		return front.data;
	}
	public static void main(String[] args) {
		Queues_Using_LinkedList queue = new Queues_Using_LinkedList();
		
		queue.enqueue(10);
		queue.enqueue(20);
		queue.enqueue(30);
		
		System.out.println(queue.dequeue());
		System.out.println(queue.peek());
	}
	
}

//o/p:-
//10
//20
//






























