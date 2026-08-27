class Solution {
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        int n = inorder.length;
        return build(0, n-1, 0, n-1, inorder, postorder);       
    }
    public TreeNode build(int inLo, int inHi, int postLo, int postHi, int[] inorder, int[] postorder){
        if(inLo > inHi || postLo > postHi) return null;
        int val = postorder[postHi];
        TreeNode root = new TreeNode(val);
        int  r = -1;
        for(int i = inLo; i <= inHi; i++){
            if(inorder[i] == val){
                r = i;
                break;
            }
        }
        int count = r- inLo;
        root.left = build(inLo, r-1, postLo, postLo + count -1, inorder, postorder );
        root.right = build(r+1, inHi, postLo + count, postHi -1, inorder, postorder );
        return root;
    }
}