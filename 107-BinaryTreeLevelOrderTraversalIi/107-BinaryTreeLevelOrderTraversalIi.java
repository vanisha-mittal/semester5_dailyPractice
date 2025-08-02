// Last updated: 8/2/2025, 4:03:33 PM
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
import java.util.*;

class Solution {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        List<Integer> list = new ArrayList<>();
        List<List<Integer>> result = new LinkedList<>();
        Stack<List<Integer>> stack = new Stack<>();

        if (root == null) return result;

        q.add(root);
        q.add(null);

        while (!q.isEmpty()) {
            TreeNode curr = q.remove();

            if (curr == null) {
                stack.push(new ArrayList<>(list));
                list = new ArrayList<>();

                if (q.isEmpty()) break;
                q.add(null);
            } else {
                list.add(curr.val);
                if (curr.left != null) q.add(curr.left);
                if (curr.right != null) q.add(curr.right);
            }
        }

        while (!stack.isEmpty()) {
            result.add(stack.pop());
        }

        return result;
    }
}