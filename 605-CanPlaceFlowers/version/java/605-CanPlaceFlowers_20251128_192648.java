// Last updated: 11/28/2025, 7:26:48 PM
1class Solution {
2    public boolean canPlaceFlowers(int[] flowerbed, int n) {
3        for (int i = 0; i < flowerbed.length; i++) {
4            boolean left = i == 0 || flowerbed[i - 1] == 0;
5            boolean right = i == flowerbed.length - 1 || flowerbed[i + 1] == 0;
6            
7            if (left && right && flowerbed[i] == 0) {
8                flowerbed[i] = 1;
9                n--;
10            }
11        }
12        return n <= 0;        
13    }
14}