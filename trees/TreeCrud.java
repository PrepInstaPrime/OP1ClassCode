import java.util.LinkedList;
import java.util.Queue;
class TreeNode {
    int data;
    TreeNode left;
    TreeNode right;
    public TreeNode(int data){
        this.data=data;
        this.left=this.right=null;
    }
}
public class TreeCrud {
    static TreeNode root;
    static void insert(int data){
        TreeNode newNode= new TreeNode(data);
        Queue<TreeNode> q= new LinkedList<>();
        if(root==null){
            root=newNode;
            return;
        }
        q.offer(root);
        while (!q.isEmpty()) {
            TreeNode temp = q.poll();
            if(temp.left!=null){
                q.offer(temp.left);
            }else{
                temp.left=newNode;
                return;
            }
            if(temp.right!=null){
                q.offer(temp.right);
            }else{
                temp.right= newNode;
                return;
            }
        }
    }
    static void inorder(TreeNode node){
        if(node==null){
            return;
        }
        inorder(node.left);
        System.out.print(node.data+" ");
        inorder(node.right);
    }
    public static void main(String[] args) {
        insert(5);
        insert(4);
        insert(3);
        insert(2);
        insert(1);
        // System.out.println(root.data);
        inorder(root);
    }
}
