
public class AR_Mirror_Invert_Tree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BinaryTree bt = new BinaryTree();
		
		bt.root = new TreeNode(8);
		bt.root.left = new TreeNode(3);
		bt.root.right = new TreeNode(10);
		bt.root.left.left = new TreeNode(1);
		bt.root.left.right = new TreeNode(6);
		bt.root.left.right.left = new TreeNode(4);
		bt.root.left.right.right = new TreeNode(7);
		bt.root.right.right = new TreeNode(15);
		bt.root.right.right.left = new TreeNode(13);
		bt.root.right.right.left.right = new TreeNode(14);
		
	}
	
	// swap lowest first and then keep going up 
	// Go to left and then right .. 
	// When it is leaf node because its childs are null nothing happens
	// when it returns to the node above that it swaps and goes up again
	static TreeNode mirror_tree(TreeNode root) {
		
		TreeNode temp ;
		
		if(root != null) {
			
			mirror_tree(root.left);
			mirror_tree(root.right);
			
			temp = root.left;
			root.left = root.right;
			root.right = temp;
		}
		
		return root;
	}

}
