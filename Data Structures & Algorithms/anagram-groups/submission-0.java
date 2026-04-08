class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        int n = strs.length;
        List<List<String>> ans = new ArrayList<>();
        boolean[] used=new boolean[n];

        for (int i = 0; i < n; i++) {
            if(used[i]) continue;
            List<String> group=new ArrayList<>();
            group.add(strs[i]);
            used[i]=true;

            for (int j = i + 1; j < n; j++) {
                if(!used[j] && strs[i].length() == strs[j].length()){
                    if(isAna(strs[i],strs[j])){
                    group.add(strs[j]);
                    used[j]=true;
                    }
                    
                }
            }
            ans.add(group);
        }

        return ans;
    }

    public boolean isAna(String s1, String s2) {
        int[] freq = new int[26];

        for (int i = 0; i < s1.length(); i++) {
            freq[s1.charAt(i) - 'a']++;
            freq[s2.charAt(i) - 'a']--;
        }

        for (int f : freq) {
            if (f != 0) return false;
        }
        return true;
    }
}