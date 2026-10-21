/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        //preorder => root,left,right
        Stack<TreeNode> st = new Stack<TreeNode>();
        List<Integer> lt = new ArrayList<>();
        if(root == null) return lt;
        st.push(root);
        while(!st.isEmpty()){
            TreeNode rt = st.pop();
            lt.add(rt.val);
            if(rt.right != null) st.push(rt.right);
            if(rt.left != null) st.push(rt.left);
        }
        return lt;
    }
}