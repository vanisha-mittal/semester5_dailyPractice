// Last updated: 2/9/2026, 11:58:14 AM
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
17    public TreeNode balanceBST(TreeNode root) {
18        ArrayList<TreeNode> nodes=new ArrayList<>();
19        Inorder(root,nodes);
20        return Balance(nodes,0,nodes.size()-1);
21    }
22    public static void Inorder(TreeNode root, ArrayList<TreeNode> nodes){
23
24        if(root==null) return;
25        Inorder(root.left,nodes);
26        nodes.add(root);
27        Inorder(root.right,nodes);
28    }
29    public static TreeNode Balance( ArrayList<TreeNode> nodes,int l ,int r){
30        //base case
31            if(l>r) return null;
32
33            int mid=(l+r)/2;
34            TreeNode node=nodes.get(mid);
35            node.left=Balance(nodes,l,mid-1);
36            node.right=Balance(nodes,mid+1,r);
37            return node;
38    }
39}