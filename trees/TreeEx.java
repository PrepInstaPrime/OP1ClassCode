class TreeNode {
    int data;
    TreeNode left;
    TreeNode right;
    public TreeNode(int data){
        this.data=data;
        this.left=this.right=null;
    }
}
public class TreeEx {
    static void inorder(TreeNode root){
        if(root==null){
             return;
        }
        inorder(root.left);
        System.out.print(root.data +" ");
        inorder(root.right);
    }
    static void preorder( TreeNode root){
        if(root==null){
             return;
        }
        System.out.print(root.data+ " ");
        preorder(root.left);
        preorder(root.right);
    }
    static void postorder(TreeNode root){
        if(root==null){
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data+ " ");
    }
    public static void main(String[] args) {
        TreeNode root= new TreeNode(5);
        root.left=new TreeNode(4);
        root.right= new TreeNode(3);
        root.left.left= new TreeNode(2);
        root.left.right=new TreeNode(1);
        // System.out.println(root.data);
        inorder(root);
        System.out.println();
        preorder(root);
        System.out.println();
        postorder(root);
    }
}
