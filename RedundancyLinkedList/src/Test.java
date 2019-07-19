import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.Scanner;

public class Test {

	public static LinkedListNode insert_node_into_singlylinkedlist(LinkedListNode head ,LinkedListNode tail ,Integer item )
	{
		LinkedListNode newTail = new LinkedListNode();
		newTail.val = item;
		//ilk item
		if( head == null &&  tail == null )
		{
			head = newTail;
			head.next = null;
			tail = newTail;
			tail.next = null;
			return newTail;
		}
		//2.item
		if(head.next == null)
		{
			head.next = newTail;
			tail = newTail;
			return newTail;
		}
		
		tail.next = newTail ;
		newTail.next= null;
		
		return newTail;
	}
	public static LinkedListNode distinct(LinkedListNode head )
	{
		LinkedListNode currentNode = head;
		LinkedListNode innerCurrentNode = head.next;
		LinkedListNode innerCurrentNodePrev = head;
		
		
		while(currentNode != null )
		{
			innerCurrentNode = currentNode.next;
			innerCurrentNodePrev = currentNode;
			
			while(innerCurrentNode != null )
			{
				if( currentNode.val == innerCurrentNode.val )
				{
					innerCurrentNodePrev.next = innerCurrentNode.next;
					innerCurrentNode = null;
					innerCurrentNode = innerCurrentNodePrev.next;
				}
				else
				{
					innerCurrentNode = innerCurrentNode.next;
					innerCurrentNodePrev = innerCurrentNodePrev.next;
				}
			}	
			currentNode = currentNode.next; 	
		}
		
		return head;
	}
	
	public static void main(String[] args) throws IOException {
		String pathname = "C:\\Users\\su_vo\\Desktop\\Sayilar.txt";
		File file = new File(pathname);

		
		Scanner in = new Scanner(file);
		 
		//System.out.println("Enter linkedList seri");  
		Integer head_Size = Integer.valueOf(in.next() ); //Integer.valueOf(in.nextLine());
		
		LinkedListNode head = null;
		LinkedListNode tail = null;
		LinkedListNode result = null;
		
		
		for(int i=0 ;i <head_Size ;i++)
		{
			int item = Integer.valueOf(in.next());
			tail = insert_node_into_singlylinkedlist(head, tail, item);
			
			if(i == 0) 
				head = tail;
		}
		
		//lets print what we have
		
		LinkedListNode currentNode = head;
		while( currentNode != null )
		{
			System.out.println("val: " + currentNode.val);
			currentNode = currentNode.next;
			
		}
			
		
		result = distinct(head);
		
		while( result != null)
		{
			System.out.println(result.val );
			result = result.next;
		}
			
		
	}

}
