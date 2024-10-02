package com.learning.dsa.tree;

import java.util.*;

public class TreeTraversal {

    // iterative approach
    public List<Integer> inorderTraversalIterative(TreeNode root){
        List<Integer> result = new ArrayList<>();
        Comparable;
        Predicate;
        Comparator
        Stack<TreeNode> stack = new Stack<>();
        if(root==null)
            return result;
        while(true){
            if(root != null){
                stack.push(root);
                root = root.left;
            }
            else{
                if(stack.isEmpty()) break;
                root = stack.peek();
                result.add(root.val);
                stack.pop();
                root = root.right;
            }
        }
        return result;
        Object
    }

}
