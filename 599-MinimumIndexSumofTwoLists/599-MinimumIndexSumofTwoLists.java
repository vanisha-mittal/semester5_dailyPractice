// Last updated: 9/11/2025, 10:27:06 PM
class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        Map<String, Integer> map = new HashMap(list1.length);
        List<String> rez = new ArrayList(list1.length);
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < list1.length; i++) {
            map.put(list1[i], i);
        }

        for (int i = 0; i < list2.length && i <= min; i++) {
            String key = list2[i];

            if (map.containsKey(key)) {
                int value = map.get(key) + i;
                
                if (value < min) {
                    min = value;
                    rez.clear();
                    rez.add(key);
                } else if (value == min) {
                    rez.add(key);
                }
            }
        }

        return rez.toArray(new String[0]);
    }
}