package aug2018;

import java.util.LinkedList;
import java.util.Queue;

public class CountHalfNodesInBinaryTree {
	Node root;
	
	public int getHalfNodeCount(){
		Queue<Node> queue = new LinkedList<>();
		queue.add(root);
		int count = 0;
		
		while(!queue.isEmpty()){
			Node temp = queue.poll();
			if(temp.left!=null && temp.right==null ||
				temp.left==null && temp.right!=null)
				count++;
		}
		return 0;
	}
	public static void main(String[] args) {
		CountHalfNodesInBinaryTree tree = new CountHalfNodesInBinaryTree();
		tree.root = new Node(1);
		tree.root.left = new Node(7);
		tree.root.right = new Node(5);
		tree.root.left.right = new Node(6);
		tree.root.left.right.left = new Node(1);
		tree.root.left.right.right = new Node(11);
		tree.root.right.right = new Node(9);
		tree.root.right.right.left = new Node(4);
		
		System.out.println(tree.getHalfNodeCount());
	}
}
