package may2018;
//height is number of nodes on the longest path from root to the deepest node
public class HeightOfBinaryTree_usingRecursion {
	Node root;
	public static void main(String[] args) {
		HeightOfBinaryTree_usingRecursion tree = new HeightOfBinaryTree_usingRecursion();
		tree.root = new Node(1);
		tree.root.left = new  Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);
		tree.root.left.right.right = new Node(6);
		
		System.out.println(tree.maxDepth(tree.root));
	}
	
	public int maxDepth(Node node) {
		if(node == null)
			return 0;
		else {
			int lDepth = maxDepth(node.left);
			int rDepth = maxDepth(node.right);
			
			if(lDepth > rDepth)
				return lDepth+ 1;
			else
				return rDepth + 1;
		}
	}
}
