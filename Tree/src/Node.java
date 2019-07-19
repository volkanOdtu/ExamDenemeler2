
public class Node {
	public int value;
	public Node leftChild;
	public Node rightChild;
	public Node parent;
	public Node(int value)
	{
		this.value = value;
	}
	
	public Boolean hasChild()
	{
		if(this.leftChild == null && this.rightChild == null )
			return false;
		return true;
	}
}
