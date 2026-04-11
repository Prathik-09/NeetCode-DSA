class Solution {
    public boolean isPalindrome(String s) {
        int n=s.length();
        int l=0,r=n-1;
        while(l<=r){
            char ch1=s.charAt(l);
            char ch2=s.charAt(r);
            if(!Character.isLetterOrDigit(ch1)){
                l++;
            }
            else if(!Character.isLetterOrDigit(ch2)){
                r--;
            }
            else{
                if(Character.toLowerCase(ch1) != Character.toLowerCase(ch2)){
    return false;
}
                else{
                    l++;
                    r--;
                }
            }
        }
        return true;
    }
}
