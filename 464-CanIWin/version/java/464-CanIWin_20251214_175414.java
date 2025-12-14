// Last updated: 12/14/2025, 5:54:14 PM
1class Solution {
2    public boolean canIWin(int maxChoosableInteger, int desiredTotal) {
3        if (desiredTotal == 0) {
4            return true;
5        }
6        if ((maxChoosableInteger * (maxChoosableInteger + 1)) / 2 < desiredTotal) {
7            return false;
8        }
9        
10        Map<Integer, Boolean> memo = new HashMap<>();
11        return canIWinHelper(maxChoosableInteger, desiredTotal, 0, memo);
12    }
13
14    private boolean canIWinHelper(int maxChoosableInteger, int desiredTotal, int usedNumbers, Map<Integer, Boolean> memo) {
15        if (memo.containsKey(usedNumbers)) {
16            return memo.get(usedNumbers);
17        }
18        
19        for (int i = 1; i <= maxChoosableInteger; i++) {
20            int currentBit = 1 << i;
21            if ((usedNumbers & currentBit) == 0) { // Check if the number i is available
22                if (desiredTotal - i <= 0 || 
23                    !canIWinHelper(maxChoosableInteger, desiredTotal - i, usedNumbers | currentBit, memo)) {
24                    memo.put(usedNumbers, true);
25                    return true;
26                }
27            }
28        }
29        
30        memo.put(usedNumbers, false);
31        return false;
32    }
33}