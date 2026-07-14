class Solution {
    public String minWindow(String s, String t) {
        if(t.length()>s.length()) return "";
        int[] freq=new int[128];
        
        for (char ch : t.toCharArray()) {
            freq[ch]++;
        }
        int l=0,start=0,minLen=Integer.MAX_VALUE;
        int remaining=t.length();
        for(int r=0;r<s.length();r++){
            char ch=s.charAt(r);

            if(freq[ch]>0){
                remaining--;
            }
            freq[ch]--;

            while(remaining==0){
                if(r-l+1<minLen){
                    minLen=r-l+1;
                    start=l;
                }
                char leftChar = s.charAt(l);
                freq[leftChar]++;
                if (freq[leftChar] > 0) {
                    remaining++;
                }

                l++;
            }
        }
         if (minLen == Integer.MAX_VALUE) {
            return "";
        }

        return s.substring(start, start + minLen);
    }
}
