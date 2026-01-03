// Last updated: 1/3/2026, 3:24:03 PM
1class Solution {
2    public int coinChange(int[] coins, int amount) {
3        HashMap<Integer,Integer> hm=new HashMap<>();
4        return print(coins, amount, hm);
5    }
6    public static int print(int[] arr, int amount, HashMap<Integer,Integer> hm){
7        if(amount==0){
8            return 0;
9        }
10        if(amount<0){
11            return -1;
12        }
13        if(hm.containsKey(amount)){
14            return hm.get(amount);
15        }
16
17        int coins= -1;
18		for(int i:arr) {
19			int amountLeft=amount-i;
20			int coinsLeft=print(arr,amountLeft,hm);
21            if(coinsLeft!=-1){
22                if((coinsLeft+1)<coins || coins==-1){
23                    coins=coinsLeft+1;
24                }
25            }
26		}
27        hm.put(amount,coins);
28        return coins;
29    }
30}