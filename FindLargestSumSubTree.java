class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;
	TreeNode(int val) {
		this.val = val;
	}
}

public class FindLargestSumSubTree {
	
	private static int findLargestSubtreeSumHelper(TreeNode node, int ans) {
		if(node == null) return 0;
		
		int sum = node.val 
					+ findLargestSubtreeSumHelper(node.left, ans) 
					+ findLargestSubtreeSumHelper(node.right, ans);
		
		ans = Math.max(sum, ans);
			
		return ans;
	}
	
	public static int findLargestSubtreeSum(TreeNode node) {
    System.out.print("FindLargestSumSubTree: ");
		if(node == null) return 0;
		int ans = findLargestSubtreeSumHelper(node, Integer.MIN_VALUE);
		
		return ans;
	}


}
