// Last updated: 12/14/2025, 5:40:24 PM
1class Solution {
2    public String getHint(String secret, String guess) {
3        int bulls = 0;
4        int cows = 0;
5        int[] secretCounts = new int[10];
6        int[] guessCounts = new int[10];
7
8        for (int i = 0; i < secret.length(); i++) {
9            char secretChar = secret.charAt(i);
10            char guessChar = guess.charAt(i);
11
12            if (secretChar == guessChar) {
13                bulls++;
14            } else {
15                secretCounts[secretChar - '0']++;
16                guessCounts[guessChar - '0']++;
17            }
18        }
19
20        for (int i = 0; i < 10; i++) {
21            cows += Math.min(secretCounts[i], guessCounts[i]);
22        }
23
24        return bulls + "A" + cows + "B";
25    }
26}