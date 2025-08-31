import java.util.LinkedList;
import java.util.Queue;

class TreeNode{
    int data;
    TreeNode left;
    TreeNode right;
    public TreeNode(int data){
        this.data=data;
        this.left=this.right=null;
    }
}
public class BinaryTreeEx {
    static TreeNode root;
    static void insert(int data){
        TreeNode newNode= new TreeNode(data);
        if(root==null){
            root= newNode;
            return;
        }
        // bfs
        Queue<TreeNode> q= new LinkedList<>();
        q.offer(root);
        while (!q.isEmpty()) {
            TreeNode temp = q.poll();
            if(temp.left==null){
                temp.left=newNode;
                return;
            }else{
                q.offer(temp.left);
            }
            if(temp.right==null){
                temp.right=newNode;
                return;
            }else{
                q.offer(temp.right);
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
    static void deleteNode(int data){
        if(root==null){
            System.out.println("Tree is empty");
            return;
        }
        if(root.left==null&&root.right==null){
            if(root.data==data){
                root=null;
                return;
            }else{
                System.out.println("data not found");
            }
        }
        TreeNode temp=null;
        TreeNode keyNode=null;
        Queue<TreeNode> q= new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            temp= q.poll();
            if(temp.data==data){
                keyNode=temp;
            }
            if(temp.left!=null){
                q.offer(temp.left);
            }
            if(temp.right!=null){
                q.offer(temp.right);
            }
        }
        if(keyNode==null){
            System.out.println("data not found");
        }else{
            int x= temp.data;  // 1
            deleteDeepest(temp);
            keyNode.data=x;
        }
    }
    static void deleteDeepest(TreeNode node){
        Queue<TreeNode> q= new LinkedList<>();
        q.offer(root);
        while (!q.isEmpty()) {
            TreeNode temp= q.poll();
            if(temp.left!=null){
                if(temp.left==node){
                    temp.left=null;
                    return;
                }else{
                    q.offer(temp.left);
                }
            }
            if(temp.right!=null){
                if(temp.right==node){
                    temp.right=null;
                    return;
                }else{
                    q.offer(temp.right);
                }
            }
        }
    }
    static int count(TreeNode node){
        if(node==null){
            return 0;
        }
        return 1+count(node.left)+count(node.right);
    }
    public static void main(String[] args) {
        insert(5);
        insert(4);
        insert(3);
        insert(2);
        insert(1);
        inorder(root);
        deleteNode(4);
        System.out.println();
        inorder(root);
        System.out.println();
        System.out.println(count(root));
    }
    
}
