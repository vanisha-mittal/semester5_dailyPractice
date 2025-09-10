// Last updated: 9/10/2025, 12:36:05 PM
class Solution {
    public int minOperations(String s) {
        TreeSet<Character> d=new TreeSet<>();
        for(char i:s.toCharArray()){
            if(i!='a'){
            d.add(i);
                
            }
        }
        int steps=0;
        while(d.size()>1){
            char x=d.pollFirst();
            char y=d.pollFirst();
            steps+=y-x;
            d.add(y);
        }
        if(d.size()==1){
        steps+=(26-(d.pollFirst()-'a'))%26;
            
        }
        return steps;
    }
}