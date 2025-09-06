# Question 1 : 
## https://leetcode.com/problems/balanced-binary-tree/description/

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
    public int height(TreeNode node){
        if(node==null){
            return 0;
        }
        int lh = height(node.left);
        if(lh==-1){
            return -1;
        }
        int rh = height(node.right);
        if(rh==-1){
            return -1;
        }
        if(Math.abs(lh-rh)>1){
            return -1;
        }
        return 1+Math.max(lh,rh);
    }
    public boolean isBalanced(TreeNode root) {
        return height(root)!=-1;
    }
}
```
# Question 2: 
## https://leetcode.com/problems/path-sum/description/ 
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
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root==null){
            return false;
        }
        if(root.left==null&&root.right==null&&root.val==targetSum){
            return true;
        }
        return hasPathSum(root.left, targetSum-root.val) || hasPathSum(root.right, targetSum-root.val);
    }
} 
```

# question 3: 
## https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-tree/description/ 
```
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root==null || root==p || root==q){
            return root;
        }
        TreeNode left= lowestCommonAncestor(root.left, p, q);
        TreeNode right= lowestCommonAncestor(root.right, p, q);
         if(left!=null&&right!=null){
            return root;
         }
        // i need to return non null value 
        return  left==null?right:left;
    }
}
```
 # question 4: 
 ## https://leetcode.com/problems/binary-tree-right-side-view/
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
    public List<Integer> rightSideView(TreeNode root) {
        ArrayList<Integer> res= new ArrayList<>();
        Queue<TreeNode> q= new LinkedList<>();
        if(root==null) return res;
        q.offer(root);
        while(!q.isEmpty()){
            TreeNode rightTemp=null;
            int size=q.size();
            for(int i=0;i<size;i++){
                TreeNode temp= q.poll();
                rightTemp=temp;
                if(temp.left!=null) {
                    q.offer(temp.left);
                }
                if(temp.right!=null) {
                    q.offer(temp.right);
                }
            }
            if(rightTemp!=null){
                 res.add(rightTemp.val);
            }
           
        }
        return res;
    }
}
 ```