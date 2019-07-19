
public class Test {

	public static void main(String[] args) {
		binaryTree tree = new binaryTree();
		tree.addNode(new Node(44));
		tree.addNode(new Node(17));
		tree.addNode(new Node(28));
		tree.addNode(new Node(29));
		tree.addNode(new Node(88));
		tree.addNode(new Node(15));
		tree.addNode(new Node(10));
		tree.addNode(new Node(16));
		tree.addNode(new Node(27));
		
		tree.printTree();
	}

}
