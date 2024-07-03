package BinaryTree;

public class BST {

    private Node root;
    public BST(){

    }

    public int height(Node node){
        if(node==null){
            return -1;
        }
        return node.height;
    }

    public boolean isEmpty(){
        return root == null;
    }

    public void display(){
        display(root,"Root Node: ");
    }

    private void display(Node node, String details){
        if(node==null){
            return;
        }
        System.out.println(details+node.getValue());
        display(node.left,"Left child of" + node.getValue() + " : ");
        display(node.right,"right child of" + node.getValue() + " : ");
    }

    public void insert(int value){
        root=insert(value,root);
    }
    public Node insert(int value, Node node){
        if(node==null){
            node = new Node(value);
            return node;
        }
        if(value<node.value){
            node.left=insert(value,node.left);
        }
        if(value>node.value){
            node.right=insert(value,node.right);
        }
return node;
    }
    public boolean balanced(){
        return balanced(root);
    }
    public boolean balanced(Node node){
        if(node==null){
            return true;
        }
        return Math.abs(height(node.left)-height(node.right))<=1 && balanced(node.left) && balanced(node.right);
    }

    public void populate(int[] nums){
        for (int i = 0; i < nums.length; i++) {
            this.insert(nums[i]);
        }
    }
    public void populatedsorted(int[] nums){
        populatedsorted(nums,0,nums.length);
    }

    public void populatedsorted(int[] nums, int start , int end){
        if(start>=end){
            return;
        }
        int mid=start-end/2;
        this.insert(nums[mid]);
        populatedsorted(nums,start,mid);
        populatedsorted(nums,mid+1,end);
    }

    public void preOrder(){
        preOrder(root);
    }

    private void preOrder(Node node){
        if(node==null){
            return;
        }
        System.out.println(node.value+" ");
        preOrder(node.left);
        preOrder(node.right);
    }
    public void inOrder(){
        inOrder(root);
    }
    private void inOrder(Node node){
        if(node==null){
            return;
        }
        inOrder(node.left);
        System.out.println(node.value+" ");

        inOrder(node.right);
    }
    public void postOrder(){
        postOrder(root);
    }
    private void postOrder(Node node){
        if(node==null){
            return;
        }

        postOrder(node.left);
        postOrder(node.right);
        System.out.println(node.value+" ");
    }
    public class Node{
        private int value;
        private int height;
        private Node left;
        private Node right;

        public Node(int value){
            this.value=value;
        }

        public int getValue(){
            return value;
        }

    }


}
