// Last updated: 10/22/2025, 4:11:11 PM
class Solution {
    public boolean judgeCircle(String moves) {
        int x = 0, y = 0;

        for (char c : moves.toCharArray()) {
            if (c == 'U') y++;
            else if (c == 'D') y--;
            else if (c == 'R') x++;
            else if (c == 'L') x--;
        }

        return x == 0 && y == 0;

    }
}