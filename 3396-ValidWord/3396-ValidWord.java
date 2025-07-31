// Last updated: 7/31/2025, 5:12:09 PM
class Solution {
    public boolean isValid(String word) {
        if(word.length()<3){
            return false;
        }
        boolean vowel=false;
        boolean cons=false;
        boolean sp=true;
        for (int i=0;i<word.length();i++){
            char c=word.charAt(i);
            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U'){
                vowel=true;
            }
            else if((c<='z' &&c>='a')||(c<='Z' && c>='A')){
                cons=true;
            }
            else if(c>'9'||c<'0'){
                sp=false;
            }
        }
        return(vowel&&cons&&sp);
        
    }
}