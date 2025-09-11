// Last updated: 9/11/2025, 10:28:16 PM
class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        if(list1.length>list2.length){
            return findRestaurant(list2,list1);
        }
        Map<String,Integer>map=new HashMap<>();
        for(int i=0;i<list1.length;i++){
            map.put(list1[i],i);
        }
        ArrayList<String>list=new ArrayList<>();
        int temp=0;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<list2.length;i++){
            if(i>min)break;
            if(map.containsKey(list2[i])){
                int ind=i+map.get(list2[i]);
                if(ind<min){
                    list.clear();
                    list.add(list2[i]);
                }else if(ind==min){
                    list.add(list2[i]);
                }
                min=Math.min(min,ind);
            }
        }return list.toArray(new String[0]);
        
    }
}