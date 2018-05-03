package may2018;

//O(n)
//T(n)  = T(k) + T(n-k-1) + c

public class TreeTraversal_DFS_InorderPreorderPostorder {
  Node root;
  
  public static void main(String[] args) {
	TreeTraversal_DFS_InorderPreorderPostorder tree = new TreeTraversal_DFS_InorderPreorderPostorder();
	tree.root = new Node(1);
	tree.root.left = new Node(2);
	tree.root.right= new Node(3);
	tree.root.left.left = new Node(4);
	tree.root.left.right = new Node(5);
	
	System.out.println("Preorder traversal of the binary tree is: ");
	tree.preorder();
	System.out.println("\nPostorder traversal of the binary tree is: ");
	tree.postorder();
	System.out.println("\nInorder traversal of the binary tree is: ");
	tree.inorder();
}
  void preorder() {
	  preorder(root);
  }
  void postorder() {
	  postorder(root);
  }
  void inorder() {
	  inorder(root);
  }
  
  public void preorder(Node node) {
	  if(node == null)
		  return;
	  System.out.print(node.data+ " ");
	  preorder(node.left);
	  preorder(node.right);
  }
  
  public void postorder(Node node) {
	  if(node == null)
		  return;
	  postorder(node.left);
	  postorder(node.right);
	  System.out.print(node.data+ " ");
  }
  
  public void inorder(Node node) {
	  if(node == null)
		  return;
	  inorder(node.left);
	  System.out.print(node.data+ " ");
	  inorder(node.right);
  }
}
