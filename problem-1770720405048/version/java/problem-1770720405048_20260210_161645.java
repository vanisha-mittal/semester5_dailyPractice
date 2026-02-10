// Last updated: 2/10/2026, 4:16:45 PM
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
17    int camera=0;
18    public int minCameraCover(TreeNode root) {
19        // has camera=1, need camera=-1, covered =0
20        int c=minCamera(root);
21        if(c==-1){
22            camera++;
23        }
24        return camera;
25    }
26    public int minCamera(TreeNode root){
27        if(root==null){
28            return 0;
29        }
30        int left=minCamera(root.left);
31        int right=minCamera(root.right);
32        if(left==-1|| right==-1){
33            camera++;
34            return 1;
35        }
36        if(left==1||right==1){
37            return 0;
38        }
39        return -1;
40    }
41}