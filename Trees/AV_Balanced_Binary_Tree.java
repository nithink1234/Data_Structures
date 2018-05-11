import java.util.*;
public class AV_Balanced_Binary_Tree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BinaryTree bt = new BinaryTree();
		
		bt.root = new TreeNode(5);
		bt.root.left = new TreeNode(4);
		bt.root.right = new TreeNode(8);
		bt.root.left.left = new TreeNode(11);
		bt.root.right.left = new TreeNode(13);
		bt.root.right.right = new TreeNode(4);
		bt.root.right.right.right = new TreeNode(1);
		bt.root.left.left.left = new TreeNode(7);
		bt.root.left.left.right = new TreeNode(2);

		System.out.println(balancedBinaryTree(bt.root));
	}

	
	static boolean balancedBinaryTree(TreeNode root) {
		
		if(root == null)
			return false;
		
		Queue<TreeNode> q = new LinkedList<TreeNode>();
		TreeNode current;
		int prevnodes =0;
		int currentnodes = 0;
		int lastbalancedlevel = 0;
		int currentlevel = 0;
		q.add(root);
		q.add(null);
		
		while(!q.isEmpty()) {
			
			current = q.poll();
			currentnodes++;
			
			if(current == null) {
				
				currentlevel ++ ;
				
				if(currentlevel - lastbalancedlevel > 1)
					return false;
				
				if(prevnodes!=0 && currentnodes != prevnodes*2) {
					lastbalancedlevel = currentlevel -1;
				}
				
				prevnodes = currentnodes;
				
				q.add(null);
			}
			
			else {
				if(current.left != null)
					q.add(current.left);
				
				if(current.right != null)
					q.add(current.right);
			}

			
		}
		
		return true;
	}
}
