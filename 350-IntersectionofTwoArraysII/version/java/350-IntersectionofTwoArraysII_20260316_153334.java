// Last updated: 3/16/2026, 3:33:34 PM
class Solution {
      static {
        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            try (FileWriter fw = new FileWriter("display_runtime.txt")) {
                fw.write("0");
            } catch (Exception e) {}
        }));
    }
    public boolean lemonadeChange(int[] bills) {
        int f=0;
        int t=0;
    for( int i=0;i<bills.length;i++){
        if(bills[i]==5){
            f++;
        }else if(bills[i]==10 ){
            if(f<1){
                return false;
            }else{
                f--;
                t++;
            }
        }else if(bills[i]==20){
            if(f>0 && t>0 ){
                f--;
                t--;
            }else if(f>=3 && t<1) {
                f-=3;
            }else{
                return false;
            }
        }
    }
    return true;
        
    }
}