// Last updated: 8/2/2025, 4:03:15 PM
class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int t_gas=0;
        int c_gas=0;
        int start=0;
        for(int i=0;i<gas.length;i++){
            t_gas+=gas[i]-cost[i];
        }
        if(t_gas<0){
            return -1;
        }
        for(int i=0;i<gas.length;i++){
            c_gas+=gas[i]-cost[i];
            if(c_gas<0){
                c_gas=0;
                start=i+1;
            }
        }
        return start;
    }
}