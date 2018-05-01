
public class AC_Post_order_Traversal extends BinaryTree{

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
		
		
		Post_order_Recursion(bt.root);
	}

	
	static void Post_order_Recursion(TreeNode root) {
		
		if(root == null) {
			return;
		}
		
		Post_order_Recursion(root.left);
		Post_order_Recursion(root.right);
		System.out.println(root.data);
	}
}
