class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length()==0) return 0;
        int maxi=0;
        int i=0,j=0;
        HashSet<Character> hs=new HashSet<>();
        
        while(j<s.length()){
           char ch=s.charAt(j);
           if(!hs.contains(ch)){
            hs.add(ch);
            maxi=Math.max(maxi,j-i+1);
            j++;
           }
           else{
            hs.remove(s.charAt(i));
            i++;
           }
        }
        return maxi;
    }
}
