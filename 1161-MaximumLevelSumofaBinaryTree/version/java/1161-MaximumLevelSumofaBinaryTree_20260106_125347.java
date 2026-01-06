// Last updated: 1/6/2026, 12:53:47 PM
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
17    public int maxLevelSum(TreeNode root) {
18        int max=Integer.MIN_VALUE,anslevel=1,level=1;
19        Queue<TreeNode> qu=new LinkedList<>();
20        qu.add(root);
21        while(!qu.isEmpty()){
22            
23            int sum=0;
24            int size=qu.size();
25            for(int i=0;i<size;i++){
26                TreeNode node=qu.poll();
27                sum+=node.val;
28                if(node.left!=null) qu.add(node.left);
29                if(node.right!=null)  qu.add(node.right);
30            }
31            if(sum>max){
32                max=sum;
33                anslevel=level;
34            }
35            level++;
36        }
37        return anslevel;
38
39
40    }
41}