package aug2018;

public class InOrderTraversal_WithoutRecursion {
	Node root;
	void inOrder(){
		
	}
	public static void main(String[] args) {
		InOrderTraversal_WithoutRecursion tree = new InOrderTraversal_WithoutRecursion();
		tree.root = new Node(1);
		tree.root.left= new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);
		tree.inOrder();
	}
}
