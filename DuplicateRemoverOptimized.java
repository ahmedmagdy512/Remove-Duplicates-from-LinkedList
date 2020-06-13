import java.util.HashSet;

public class DuplicateRemover 
{
	static class Node
	{
		public Node(int val)
		{
			this.val=val;
		}
		int val;
		Node next;
	}
	public static void removeDuplicate(Node head)
	{
		HashSet<Integer> hs = new HashSet<>();
		Node current = head,prev=null;
		while(current !=null)
		{
			int currentValue = current.val;
			if(hs.contains(currentValue))
			{
				prev.next = current.next;
			}
			else
			{
				hs.add(currentValue);
				prev=current;
			}
			current=current.next;
		}
	}
	 static void printList(Node head)  
	    { 
	        while (head != null)  
	        { 
	            System.out.print(head.val + " "); 
	            head = head.next; 
	        } 
	    } 
	  
	    public static void main(String[] args)  
	    { 
	        /* The constructed linked list is: 
	         10->12->11->11->12->11->10*/
	        Node start = new Node(10); 
	        start.next = new Node(12); 
	        start.next.next = new Node(11); 
	        start.next.next.next = new Node(11); 
	        start.next.next.next.next = new Node(12); 
	        start.next.next.next.next.next = new Node(11); 
	        start.next.next.next.next.next.next = new Node(10); 
	  
	        System.out.println("Linked list before removing duplicates :"); 
	        printList(start); 
	  
	        removeDuplicate(start); 
	  
	        System.out.println("\nLinked list after removing duplicates :"); 
	        printList(start); 
	    } 

}
