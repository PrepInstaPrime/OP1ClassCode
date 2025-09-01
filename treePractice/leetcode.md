# Question 1: 
## https://leetcode.com/problems/invert-binary-tree/description/ 
```
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
    public void invert(TreeNode node){
         if(node==null){
            return;
         }
         TreeNode temp= node.left;
         node.left=node.right;
         node.right= temp;
         invert(node.left);
         invert(node.right);
    }
    public TreeNode invertTree(TreeNode root) {
         invert(root);
         return root;
    }
}
```

# Question 2: 
## https://leetcode.com/problems/symmetric-tree/
```
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
    public boolean check(TreeNode node1, TreeNode node2){
        if(node1==null&&node2==null){
            return true;
        }
        if(node1==null||node2==null){
            return false;
        }
        if(node1.val!=node2.val){
            return false;
        }
        return check(node1.left,node2.right)&&check(node1.right, node2.left);

    }
    public boolean isSymmetric(TreeNode root) {
         return check(root.left, root.right);
    }
}
```

# question 3: 
## https://leetcode.com/problems/maximum-depth-of-binary-tree/description/
```
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
    static int findHeight(TreeNode node){
        if(node==null){
            return 0;
        }
        return 1+ Math.max(findHeight(node.left),findHeight(node.right) );
    }
    public int maxDepth(TreeNode root) {
        return findHeight(root);
    }
}
```