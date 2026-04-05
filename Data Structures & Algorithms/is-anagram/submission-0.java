class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;

        int[] arr=new int[26];
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            char ch1=t.charAt(i);
            arr[ch-'a']++;
            arr[ch1-'a']--;
        }
        int c=0;
        for(int i=0;i<26;i++){
            if(arr[i]!=0){
                c++;
            }
        }
        return c==0;

    }
}
