
public class AP_Diameter_Tree {

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
		
		System.out.println("Diameter: " + diameter(bt.root));
		
	}

	static int diameter (TreeNode root) {
		
		if(root == null)
			return 0;
		
	 int sum = 1 + finddeeppath(root);
		
		return sum;
	}
	
	static int finddeeppath(TreeNode root) {
		
		if(root == null)
			return 0;
		
		int left = finddeeppath(root.left);
		int right = finddeeppath(root.right);
		
		if(left > right) {
			return 1 + left;
		}
		
		return 1 + right; 
	}
}
