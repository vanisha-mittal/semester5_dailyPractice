// Last updated: 8/21/2025, 12:03:51 PM
class Solution {
    public int findMaximizedCapital(int k, int w, int[] profits, int[] capital) {
        int[][] arr=new int[profits.length][2];
        for(int i=0;i<arr.length;i++){
            arr[i][0]=capital[i];
            arr[i][1]=profits[i];
        }
        Arrays.sort(arr,(a,b)->a[0]-b[0]);
        PriorityQueue<int[]> pq=new PriorityQueue<>((a,b)->b[1]-a[1]);
        int i=0;
        while(k>0){
            while(i<arr.length && w>=arr[i][0]){
                pq.add(arr[i]);
                i++;
            }
            if(pq.isEmpty()){
                return w;
            }
            w+=pq.poll()[1];
            k--;
        }
        while(!pq.isEmpty() && k>0){
            w+=pq.poll()[1];
        }
        return w;
    }
}