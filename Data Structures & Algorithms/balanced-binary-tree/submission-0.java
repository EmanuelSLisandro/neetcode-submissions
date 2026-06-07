class Solution {
    int altura(TreeNode node) {
            if (node == null) return -1;
            return 1 + Math.max(altura(node.left), altura(node.right));
        }
    public boolean isBalanced(TreeNode root) {
        if (root == null) return true;
        return Math.abs(altura(root.left) - altura(root.right))<= 1 && isBalanced(root.right) && isBalanced(root.left);
    }
}
