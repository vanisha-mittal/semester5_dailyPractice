// Last updated: 8/6/2025, 2:13:30 PM

class Solution {
    public long minCost(int[] basket1, int[] basket2) {
        Map<Integer, Integer> count = new HashMap<>();

         for (int fruit : basket1) {
            count.put(fruit, count.getOrDefault(fruit, 0) + 1);
        }
        for (int fruit : basket2) {
            count.put(fruit, count.getOrDefault(fruit, 0) - 1);
        }

        List<Integer> toSwap = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : count.entrySet()) {
            int diff = entry.getValue();
            if (diff % 2 != 0) {
                return -1; 
            }
            for (int i = 0; i < Math.abs(diff) / 2; i++) {
                toSwap.add(entry.getKey());
            }
        }

        Collections.sort(toSwap);
        int min = Integer.MAX_VALUE;
        for (int fruit : basket1) min = Math.min(min, fruit);
        for (int fruit : basket2) min = Math.min(min, fruit);

        long cost = 0;
        int n = toSwap.size();
        for (int i = 0; i < n / 2; i++) {
            cost += Math.min(toSwap.get(i),2 * min);
        }

        return cost;
    }
}