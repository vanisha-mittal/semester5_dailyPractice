// Last updated: 2/11/2026, 10:38:57 PM
1/**
2 * Definition for a binary tree node.
3 * public class TreeNode {
4 *     int val;
5 *     TreeNode left;
6 *     TreeNode right;
7 *     TreeNode() {}
8 *     TreeNode(int val) { this.val = val; }
9 *     TreeNode(int val, TreeNode left, TreeNode right) {
10 *         this.val = val;
11 *         this.left = left;
12 *         this.right = right;
13 *     }
14 * }
15 */
16class Solution {
17    public List<List<Integer>> closestNodes(TreeNode root, List<Integer> queries) {
18        TreeSet<Integer> set = new TreeSet<>();
19        fill(set,root);
20        
21        List<List<Integer>> list = new ArrayList<>();
22        
23        for(int val : queries){
24            ArrayList<Integer> al = new ArrayList<>();
25            
26            al.add(set.floor(val)==null?-1:set.floor(val));
27            al.add(set.ceiling(val)==null?-1:set.ceiling(val));
28            
29            list.add(al);
30        }
31        
32        return list;
33    }
34    
35    public void fill(TreeSet<Integer> set,TreeNode root){
36        if(root==null){
37            return;
38        }
39        
40        set.add(root.val);
41        
42        fill(set,root.left);
43        fill(set,root.right);
44    }
45}
46