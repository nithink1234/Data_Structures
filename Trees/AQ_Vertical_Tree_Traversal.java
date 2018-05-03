import java.util.*;
public class AQ_Vertical_Tree_Traversal {

	public static void main(String[] args) {
		
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
		
		//verticalOrder(bt.root);

	}
	
	// Add node and its left and right to q 
	// its corresponding level from the root to level 
	// -1 for every node to left of the root 
	// +1 for every node to right of the root
	
	// In hasmap use level as a key and add all the nodes blon
	
   public List<List<Integer>> verticalOrder(TreeNode root) {

		List<List<Integer>> result = new ArrayList<List<Integer>>();
		
		if(root == null)
			return result;
		
		Queue<TreeNode> q = new LinkedList<TreeNode>();
		Queue<Integer> level = new LinkedList<Integer>();
		
		HashMap<Integer, ArrayList<Integer>> place = new HashMap<Integer,ArrayList<Integer>>();
		
		
		int MaxLevel = 0;
		int MinLevel = 0;
		TreeNode current = null;
		
		q.add(root);
		level.add(0);
		
		while(!q.isEmpty()) {
			
			current = q.poll();
			int lvl = level.poll();
			
			MaxLevel = Math.max(MaxLevel, lvl);
			MinLevel = Math.min(MinLevel, lvl);
			
			if(place.containsKey(lvl)) {
				place.get(lvl).add(current.data);				
			}
			else {
				ArrayList<Integer> values = new ArrayList<Integer>();
				values.add(current.data);
				place.put(lvl, values);
			}
				
				if(current.left != null) {
					q.add(current.left);
					level.add(lvl-1);
				}
				
				if(current.right != null) {
					q.add(current.right);
					level.add(lvl+1);
				}
			
			
		}
		
		for(int i= MinLevel ; i<= MaxLevel; i++) {
			
			if(place.containsKey(i)) {
				result.add(place.get(i));
			}
	}
		
		return result;

    }}
