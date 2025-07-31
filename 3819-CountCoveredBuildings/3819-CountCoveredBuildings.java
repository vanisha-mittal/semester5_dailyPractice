// Last updated: 7/31/2025, 5:09:26 PM
class Solution {
    public int countCoveredBuildings(int n, int[][] buildings) {
        int[] minRow = new int[n + 1], maxRow = new int[n + 1];
        int[] minCol = new int[n + 1], maxCol = new int[n + 1];
        Arrays.fill(minRow, Integer.MAX_VALUE);
        Arrays.fill(maxRow, Integer.MIN_VALUE);
        Arrays.fill(minCol, Integer.MAX_VALUE);
        Arrays.fill(maxCol, Integer.MIN_VALUE);

        for (int[] building : buildings) {
            int x = building[0];
            int y = building[1];
            minRow[x] = Math.min(minRow[x], y);
            maxRow[x] = Math.max(maxRow[x], y);
            minCol[y] = Math.min(minCol[y], x);
            maxCol[y] = Math.max(maxCol[y], x);
        }

        int coveredCount = 0;

        for (int[] building : buildings) {
            int x = building[0];
            int y = building[1];

            boolean hasLeft = minRow[x] < y;
            boolean hasRight = maxRow[x] > y;
            boolean hasAbove = minCol[y] < x;
            boolean hasBelow = maxCol[y] > x;
            if (hasLeft && hasRight && hasAbove && hasBelow) {
                coveredCount++;
            }
        }

        return coveredCount;
    }
}
