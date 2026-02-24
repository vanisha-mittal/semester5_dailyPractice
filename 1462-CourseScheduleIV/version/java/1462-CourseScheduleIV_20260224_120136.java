// Last updated: 2/24/2026, 12:01:36 PM
1class Solution {
2    public List<Boolean> checkIfPrerequisite(int numCourses, int[][] prerequisites, int[][] queries) {
3        boolean[][] isPrerequisite = new boolean[numCourses][numCourses];
4        for (int[] prereq : prerequisites) {
5            isPrerequisite[prereq[0]][prereq[1]] = true;
6        }
7        for (int k = 0; k < numCourses; k++) {
8            for (int i = 0; i < numCourses; i++) {
9                for (int j = 0; j < numCourses; j++) {
10                    if (isPrerequisite[i][k] && isPrerequisite[k][j]) {
11                        isPrerequisite[i][j] = true;
12                    }
13                }
14            }
15        }
16        List<Boolean> result = new ArrayList<>();
17        for (int[] query : queries) {
18            result.add(isPrerequisite[query[0]][query[1]]);
19        }
20        return result;
21    }
22}