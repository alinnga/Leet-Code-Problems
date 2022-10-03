package plan.depthFirstSearch;

public class MergeTwoBinaryTrees_617 {
    public static void main(String[] args) {
        TreeNode node15 = new TreeNode(5);
        TreeNode node12 = new TreeNode(2);
        TreeNode node13 = new TreeNode(3, node15, null);
        TreeNode root1 = new TreeNode(1, node13, node12);

        TreeNode node24 = new TreeNode(4);
        TreeNode node27 = new TreeNode(7);
        TreeNode node21 = new TreeNode(1, null, node24);
        TreeNode node23 = new TreeNode(3, null, node27);
        TreeNode root2 = new TreeNode(2, node21, node23);

        TreeNode sumTreeRoot;
        if(root1!=null && root2!= null){
            sumTreeRoot = new TreeNode();
            sumTrees(root1, root2, sumTreeRoot);
        }
    }

    private static void sumTrees(TreeNode root1, TreeNode root2, TreeNode sumRoot) {
        if(root1==null && root2 ==null){
            sumRoot = null;
            return;
        }
        else{
            TreeNode left =  new TreeNode();
            TreeNode right =  new TreeNode();
            if((root1!=null && root1.left!=null) || (root2!=null && root2.left!=null)){
                sumRoot.left = left;
            }
            if((root1!=null && root1.right!=null) || (root2!=null && root2.right!=null)){
                sumRoot.right = right;
            }
            if(root1==null && root2!=null) {
                sumRoot.val = root2.val;
                sumTrees(null, root2.left, sumRoot.left);
                sumTrees(null, root2.right, sumRoot.right);
            }
            else if(root1!=null && root2==null) {
                sumRoot.val = root1.val;
                sumTrees(root1.left, null, sumRoot.left);
                sumTrees(root1.right, null, sumRoot.right);
            }
            else{
                sumRoot.val = root1.val+root2.val;
                sumTrees(root1.left, root2.left, sumRoot.left);
                sumTrees(root1.right, root2.right, sumRoot.right);
            }
        }
    }

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }
        TreeNode(int val) {
            this.val = val;
        }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}
