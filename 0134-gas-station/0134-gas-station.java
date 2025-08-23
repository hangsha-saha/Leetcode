class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int totGas = 0;
        int totCost = 0;
        
        for(int i = 0; i < gas.length; i++)
            totGas += gas[i];
        for(int i = 0; i < cost.length; i++)
            totCost += cost[i];

        if(totGas < totCost)
            return -1;
        
        int start = 0;
        int fuel = 0;

        for(int i = 0; i < gas.length - 1; i++) {
            fuel += gas[i] - cost[i];
            if(fuel < 0) {
                start = i + 1;
                fuel = 0;
            }
        }

        return start;
    }
}