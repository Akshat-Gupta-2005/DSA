import java.util.*;
class Node{
    int val;
    Node left;
    Node right;

    Node(int n){
        this.val = n;
    }

    Node(int n, Node left, Node right){
        this.val = n;
        this.left = left;
        this.right = right;
    }
    
}

class LevelOrderTraversal{

    public static void preOrder(Node node){
        if (node == null){
            return;
        }

        System.out.print(node.val + " ");
        preOrder(node.left);
        preOrder(node.right);
    }
    
    
    public static void inOrder(Node node){
        if (node == null){
            return;
        }

        inOrder(node.left);
        System.out.print(node.val + " ");
        inOrder(node.right);
    }
    
    public static void postOrder(Node node){
        if (node == null){
            return;
        }
        
        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.val + " ");
    }

    public static Node LevelOrderConversion(int n, int [] arr){
        Queue<Node> q = new LinkedList<>();
        Node root = new Node(arr[0]);
        q.add(root);
        int i = 1;
    
        while(!q.isEmpty()){
            Node temp = q.remove();
    
            if (i<=n){
                temp.left = new Node(arr[i]);
                i++;
                q.add(temp.left);
            }
    
            if (i<=n){
                temp.right = new Node(arr[i]);
                i++;
                q.add(temp.right);
            }
        }

        return root;
    }

    public static int crazySumQuestion(Node node , int num , int sum){

        if (node.left == null && node.right == null){
            num = num*10 + node.val;
            return num;
        }

        num = num*10 + node.val;
        int left = 0;
        int right = 0;
        if (node.left != null){ left = crazySumQuestion(node.left, num , sum);}
        if (node.right != null){ right = crazySumQuestion(node.right, num , sum);}
        
        return left + right;
    }

    public static void main(String [] args){
        int [] arr = new int[]{1,2,3,4,5,6,7};
        int n = arr.length - 1;

        Node root = LevelOrderConversion(n,arr);
        
        preOrder(root);
        System.out.println();        
        inOrder(root);
        System.out.println();
        postOrder(root);
        System.out.println();

        System.out.println(crazySumQuestion(root,0,0));


    }
}