package aug2018;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Reverse_LevelOrderTraversal {
	Node root;
	void reverseLevelOrder(Node node){
		Stack<Node> S = new Stack<>();
		Queue<Node> Q = new LinkedList<>();
		Q.add(node);
		
		while(!Q.isEmpty()){
			node =Q.poll();
			S.push(node);
			
			if(node.right !=null)
				Q.add(node.right);
			
			if(node.left!=null)
				Q.add(node.left);
		}
		
		while(!S.isEmpty()){
			System.out.print(S.pop().data+ " ");
		}
	}
	public static void main(String[] args) {
		Reverse_LevelOrderTraversal tree = new Reverse_LevelOrderTraversal();
		tree.root = new Node(1);
		tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.left = new Node(6);
        tree.root.right.right = new Node(7);
        
        tree.reverseLevelOrder(tree.root);
	}
}
