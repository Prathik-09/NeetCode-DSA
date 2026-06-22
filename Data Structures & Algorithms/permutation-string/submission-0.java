class Solution {
    private boolean issame(int[] a, int[] b) {
        for (int i = 0; i < 26; i++) {
            if (a[i] != b[i]) {
                return false;
            }
        }
        return true;
    }
    public boolean checkInclusion(String s1, String s2) {
        int m=s1.length();
        int n=s2.length();

        int[] need=new int[26];
        int[] window=new int[26];
        if(m>n) return false;

        for(int i=0;i<m;i++){
            need[s1.charAt(i)-'a']++;
        }

        for(int i=0;i<m;i++){
            window[s2.charAt(i)-'a']++;
        }
        if(issame(need,window)) return true;

        for(int i=m;i<n;i++){
            window[s2.charAt(i)-'a']++;
            window[s2.charAt(i-m)-'a']--;

            if(issame(need,window)) return true;
        }
        return false;
        
    }
}
