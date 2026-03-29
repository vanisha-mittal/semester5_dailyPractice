// Last updated: 3/29/2026, 9:38:41 PM
1class TrieNode{
2    TrieNode[] children;
3    boolean endWord;
4    public TrieNode(){
5        children = new TrieNode[26];
6        endWord = false;
7    }
8}
9class WordDictionary {
10    private TrieNode root;
11    public WordDictionary() {
12        root = new TrieNode();    
13    }
14    public void addWord(String word) {
15        TrieNode node = root; 
16        for (char c : word.toCharArray()){
17            int idx = c - 'a';
18            if (node.children[idx] == null){
19                node.children[idx] = new TrieNode();
20            }
21            node = node.children[idx];
22        }
23        node.endWord = true;
24    }
25    public boolean search(String word) {
26        return dfs(word, 0, root);
27    }
28    private boolean dfs(String word, int index, TrieNode node){
29        if (index == word.length()){
30            return node.endWord;
31        }
32        char c = word.charAt(index);
33        if (c == '.'){
34            for (TrieNode child : node.children) {
35                if (child != null && dfs(word, index + 1, child))
36                    return true;
37            }
38            return false; 
39        } else{
40            int idx = c - 'a';
41            if (node.children[idx] == null){
42                return false;
43            }
44            return dfs(word, index+1, node.children[idx]);
45        }
46    }
47}