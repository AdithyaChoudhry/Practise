package Assignments;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class ques7 {

    public static void main (String[] args){
        Node root = new Node();
        root.val = 1;
        root.left = new Node();
        root.left.val = 2;
        root.right = new Node();
        root.right.val = 3;
        root.left.right = new Node();
        root.left.right.val = 5;
        root.right.right = new Node();
        root.right.right.val = 4;

        System.out.println(rightnode(root));
    }

    public  static List<Integer> rightnode(Node root){
        List<Integer> ans = new ArrayList<>();

        if(root == null){
            return ans;
        }

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while ((!queue.isEmpty())){
            int n = queue.size();
            for (int i = 0; i < n; i++) {
                Node curr = queue.poll();

                if(i==n-1){
                    ans.add(curr.val);
                }

                if(curr.left!=null){
                    queue.add(curr.left);
                }
                if(curr.right!=null){
                    queue.add(curr.right);
                }
            }
        }
        return ans;
    }


    public static class Node{
        int val;

        Node left;

        Node right;
    }
}
