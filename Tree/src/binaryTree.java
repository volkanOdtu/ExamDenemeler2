
public class binaryTree {
	Node root = null;
	
	public void addNode(Node node)
	{
		
		if(root == null)
		{
			root = node;
			return ;
		}
		
		findPlace(node, root);		
	}
	
	public void findPlace(Node addedNode ,Node currentNode)
	{
		if(addedNode.value < currentNode.value)
		{			
			if( currentNode.leftChild == null )
			{
				currentNode.leftChild = addedNode;
				return;
			}
			else
				findPlace(addedNode, currentNode.leftChild );
		}
		else // 18 geldi ,currentNode 15
		{
			if( currentNode.rightChild == null )
			{
				currentNode.rightChild = addedNode;
				return;
			}
			findPlace(addedNode, currentNode.rightChild );
		}		
	}
	
	public void printTree()
	{
		//printPostOrder(root);
		printInOrder(root);
	}
	//sol parent sag
	public void printInOrder(Node node)
	{		
		if( node.leftChild == null && node.rightChild == null )
		{
			System.out.println(node.value );
			return;
		}
		if( node.leftChild != null )
		{
			printInOrder(node.leftChild);			
		}
		System.out.println(node.value );
		
		if( node.rightChild != null )
		{
			printInOrder(node.rightChild);
		}
				
	}
	//sol sag parent
	public void printPostOrder(Node node)
	{		
		if( node.leftChild != null )
		{
			printPostOrder(node.leftChild);
		}
		if( node.rightChild != null )
		{
			printPostOrder(node.rightChild);
		}
		System.out.println(node.value );		
	}
	
}
