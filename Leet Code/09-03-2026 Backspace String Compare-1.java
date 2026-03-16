class Solution {
    public boolean backspaceCompare(String s, String t) {
        return actualstring(s).equals(actualstring(t));
    }
    public String actualstring(String input){
        StringBuilder s1=new StringBuilder();
        int hashcount=0;
        for(int i=input.length()-1;i>=0;i--){
            if(input.charAt(i)=='#'){
                hashcount++;
                continue;
            }
            if(hashcount>0){
                hashcount--;
            }
            else{
                s1.insert(0,input.charAt(i));
            }
        }
        return s1.toString();
    }
}