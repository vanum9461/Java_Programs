import java.util.*;
import java.io.*;

class Node{
    int data;
    Node left;
    Node right;

    Node(int data){
        this.data=data;
        left=null;
        right=null;
    }
}

class TopView{
    public static void topview(Node root){
        if(root.left!=null){
            root.left.right=null;
            topview(root.left);
            }
        System.out.print(root.data+" ");
        if(root.right!=null){
           root.right.left=null;
           topview(root.right);
       }

    }
   
    public static Node insert(Node root,int data){
        if(root==null)
        return new Node(data);
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
        System.out.print("TopView: ");
        topview(root);
    }
}