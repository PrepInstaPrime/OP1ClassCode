class TreeNode  {
    int data;
    TreeNode left;
    TreeNode right;
    public TreeNode(int data){
        this.data= data;
        this.left=this.right=null;
    } 
}
public class BSTEx {
    static TreeNode root;
    static void insert(int data){
        TreeNode newNode= new TreeNode(data);
        if(root==null){
            root=newNode;
            return;
        }
        insertNode(root,data);
    }
    static void insertNode(TreeNode root, int data){
        TreeNode node = new TreeNode(data);
        if(root.data>node.data){
            if(root.left==null){
                root.left= node;
                return;
            }else{
                insertNode(root.left,data);
                return;
            }
        }
        if(root.data<node.data){
            if(root.right==null){
                root.right=node;
                return;
            }else{
                insertNode(root.right, data);
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
        insert(9);
        insert(5);
        insert(20);
        insert(4);
        insert(8);
        insert(7);
        inorder(root);
    }
}
