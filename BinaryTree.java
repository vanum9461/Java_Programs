import java.util.*;
import java.io.*;

class Node{
    Node left;
    Node right;
    int data;

    Node(int data){
        left=null;
        right=null;
        this.data=data;
    }
}

class BinaryTree{
    public static void preOrder(Node root){
        if(root==null)return;
        System.out.print(root.data +" ");
        preOrder(root.left);
        preOrder(root.right);

    }

    public static void postOrder(Node root){
        if(root==null)return;
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data +" "); 
        
    }

    public static void inOrder(Node root){
        if(root==null)return;
        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);
    }

    public static int height(Node root){
        if(root==null)return -1;   //height with single node as zero
        else{
            int l=height(root.left);
            int r=height(root.right);
            if(l>r)return (l+1);
            else return (r+1);
        }
    }

    public static Node insert(Node root,int data){
        if(root==null){
            return new Node(data);
        }
        else{
            Node cur;
            if(data<=root.data){
                cur=insert(root.left,data);
                root.left=cur;
            }
            else{
                cur=insert(root.right,data);
                root.right=cur;
            }
            return root;
        }
    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        Node root=null;
        while(t-->0){
            int data=sc.nextInt();
            root=insert(root,data);
        }
        sc.close();
        System.out.print("Preorder: ");
        preOrder(root);
        System.out.println();
        System.out.print("Postorder: ");
        postOrder(root);
        System.out.println();
        System.out.print("Inorder: ");
        inOrder(root);
        System.out.println();
        System.out.print("Height of binary tree: "+height(root));
        
        
    }
}