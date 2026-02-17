// Last updated: 2/17/2026, 11:25:28 PM
1class Solution {
2    public List<String> readBinaryWatch(int turnedOn) {
3        ArrayList<String> result = new ArrayList();
4        for(int hour=0; hour<12; hour++){
5            for(int minute=0; minute<60; minute++){
6                if(Integer.bitCount(hour) + Integer.bitCount(minute) == turnedOn){
7                    if(minute<10) result.add(String.format("%d:0%d",hour,minute));
8                    else result.add(String.format("%d:%d",hour,minute));
9                }
10            }
11        }
12        return result;
13    }
14}