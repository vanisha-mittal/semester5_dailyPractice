// Last updated: 2/10/2026, 3:05:55 PM
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
17    public boolean isEvenOddTree(TreeNode root) {
18        if(root==null) return true;
19        if(root.val%2==0) return false;
20        return LevelOrder(root);
21    }
22    public boolean LevelOrder(TreeNode root) {
23        Queue<TreeNode> q=new LinkedList<>();
24        q.add(root); //addlast
25        int level=0;
26        while(!q.isEmpty()) {
27            int size=q.size();
28            ArrayList<TreeNode> al=new ArrayList<>();
29            for (int i = 0; i < size; i++) {
30                TreeNode n=q.poll();
31                al.add(n);
32                if(n.left!=null) {
33                    q.add(n.left);
34                }
35                if(n.right!=null) {
36                    q.add(n.right);
37                }
38            }
39            
40            if(level%2==1){
41                int curr=al.get(0).val;
42                if(curr%2==1) return false;
43                for(int i=1;i<al.size();i++){
44                    if(al.get(i).val>=curr || al.get(i).val%2==1) return false;
45                    curr=al.get(i).val;
46                }
47            }
48            if(level%2==0){
49                int curr=al.get(0).val;
50                if(curr%2==0) return false;
51                for(int i=1;i<al.size();i++){
52                    if(al.get(i).val<=curr || al.get(i).val%2==0) return false;
53                    curr=al.get(i).val;
54                }
55            }
56            level++;
57        }
58        
59        return true;
60    }
61}