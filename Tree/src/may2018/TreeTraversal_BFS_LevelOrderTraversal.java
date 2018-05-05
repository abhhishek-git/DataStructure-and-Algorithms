package may2018;

import java.util.LinkedList;
import java.util.Queue;

//For each node, first the node is visited and then it’s child nodes are put in a FIFO queue.
public class TreeTraversal_BFS_LevelOrderTraversal {
	Node root;
	public static void main(String[] args) {
		TreeTraversal_BFS_LevelOrderTraversal tree_level = new TreeTraversal_BFS_LevelOrderTraversal();
		tree_level.root = new Node(1);
		tree_level.root.left = new Node(2);
        tree_level.root.right = new Node(3);
        tree_level.root.left.left = new Node(4);
        tree_level.root.left.right = new Node(5);
        System.out.println("Level order traversal of tree is: ");
        tree_level.printLevelOrder();
	}
	
	public void printLevelOrder() {
		Queue<Node> queue = new LinkedList<Node>();
		queue.add(root);
		while(!queue.isEmpty()) {
			//poll() removes the present head.
			Node temp_node = queue.poll();	
			System.out.print(temp_node.data+ " ");
			//Enqueue left and right child
			if(temp_node.left != null)
				queue.add(temp_node.left);
			if(temp_node.right != null)
				queue.add(temp_node.right);
		}
	}
}
