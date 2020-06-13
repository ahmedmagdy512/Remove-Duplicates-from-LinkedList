
// java code to remove duplicates in a single linked list using brute-force technique
public class BruteForce { 
	public static class Node
	{
		public Node(int d)
		{
			this.data = d;
			next=null;
		}
		int data;
		Node next;
	}
	public static class LinkedList
	{
		public Node head;
		
		void remove_duplicates()
		{
			Node ptr1=null,ptr2=null;
			ptr1=head;
			while(ptr1!=null && ptr1.next!=null)
			{
				ptr2=ptr1;
				while(ptr2.next != null)
				{
					if(ptr2.next.data == ptr1.data) // found a duplicate
					{  
						ptr2.next=ptr2.next.next; // | 5 -> 5 -> 6 | -> | 5 -> 6 |
						System.gc();  // call the system's garbage collector in order to collect the recently-released node
					}
					else
					{
						ptr2=ptr2.next;
					}
				}
				ptr1=ptr1.next;
			}
		}
	}
	static void printList(Node node) { 
        while (node != null) { 
            System.out.print(node.data + " "); 
            node = node.next; 
        } 
    } 
	public static void main(String[] args)
	{
		LinkedList list = new LinkedList(); 
        list.head = new Node(10); 
        list.head.next = new Node(12); 
        list.head.next.next = new Node(11); 
        list.head.next.next.next = new Node(11); 
        list.head.next.next.next.next = new Node(12); 
        list.head.next.next.next.next.next = new Node(11); 
        list.head.next.next.next.next.next.next = new Node(10); 
  
        System.out.println("Linked List before removing duplicates : \n "); 
        printList(list.head); 
  
        list.remove_duplicates(); 
        System.out.println(""); 
        System.out.println("Linked List after removing duplicates : \n "); 
        printList(list.head); 	
	}

}
