package aug2018;

import java.util.Stack;

public class InOrderTraversal_WithoutRecursion {
	Node root;
	void inOrder(){
		if(root == null)
			return;
		Stack<Node> stack = new Stack<Node>();
		Node curr = root;
		while(curr!=null ||  stack.size()>0){
			while(curr!= null){
				stack.push(curr);
				curr= curr.left;
			}
			
			//curr is null at this point
			curr = stack.pop();
			System.out.print(curr.data+" ");
			curr = curr.right;
		}
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
