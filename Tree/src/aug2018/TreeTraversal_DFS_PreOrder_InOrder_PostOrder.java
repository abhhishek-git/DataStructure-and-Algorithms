package aug2018;

public class TreeTraversal_DFS_PreOrder_InOrder_PostOrder {
	Node root;
	void printPreOrder(Node node){
		if(node ==null)
			return;
		
		System.out.print(node.data+ " ");
		printPreOrder(node.left);
		printPreOrder(node.right);
	}
	
	void printInOrder(Node node){
		if(node == null)
			return;
		printInOrder(node.left);
		System.out.print(node.data+ " ");
		printInOrder(node.right);
	}
	
	void printPostOrder(Node node){
		if(node == null)
			return;
		printPostOrder(node.left);
		printPostOrder(node.right);
		System.out.print(node.data+" ");
	}
	public static void main(String[] args) {
	TreeTraversal_DFS_PreOrder_InOrder_PostOrder tree = new TreeTraversal_DFS_PreOrder_InOrder_PostOrder();
	tree.root = new Node(1);
	tree.root.left = new Node(2);
	tree.root.right = new Node(3);
	tree.root.left.left = new Node(4);
	tree.root.left.right = new Node(5);
	
	System.out.println("Preorder traversal of binary tree is: ");
	tree.printPreOrder();
	System.out.println("\nInorder traversal of binary tree is: ");
	tree.printInOrder();
	System.out.println("\nPostorder traversal of binary tree is: ");
	tree.printPostOrder();
}
	private void printPostOrder() {
		// TODO Auto-generated method stub
		printPostOrder(root);
	}

	//Wrappers
	void printPreOrder() {printPreOrder(root);}
	void printInOrder(){printInOrder(root);};
}
