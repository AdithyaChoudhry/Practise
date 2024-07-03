package Assignments;

public class ques10 {

    static class Node {
        int val;

        Node left;
        Node right;

        Node(int val){
          this.val=val;
        }
    }

    public boolean solution (Node root , int targetsum){
        if(root.left == null && root.right ==null){
            return targetsum - root.val ==0;
        }

        boolean left = false;

        if(root.left != null){
            left = solution(root.left,targetsum-root.val);
        }

        if(!left && root.right!=null){
            return solution(root.right,targetsum-root.val);
        }

        return left;
    }
    public static void main(String[] args) {
        ques10 pathSum = new ques10();

        // Creating a binary tree
        Node root = new Node(5);
        root.left = new Node(4);
        root.right = new Node(8);
        root.left.left = new Node(11);
        root.right.left = new Node(13);
        root.right.right = new Node(4);
        root.left.left.left = new Node(7);
        root.left.left.right = new Node(2);
        root.right.right.right = new Node(1);

        // Testing the solution method
        int targetSum = 22;
        boolean hasPathSum = pathSum.solution(root, targetSum);
        System.out.println("Does the binary tree have a path with sum " + targetSum + "? " + hasPathSum);
    }
}
