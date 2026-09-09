class Solution { 
    public int getSum(int a, int b) { 
        int c = 0; 
        String s = ""; 
 
        for(int i = 0; i < 32; i++) { 
            int bit1 = a & 1; 
            int bit2 = b & 1; 
 
            int sum = bit1 + bit2 + c; 
 
            s += sum % 2; 
            c = sum / 2; 
 
            a >>= 1; 
            b >>= 1; 
        } 

        String ans = new StringBuilder(s).reverse().toString(); 
        
        int ans1 = 0; 
        
        for(int i = 0; i < 32; i++) {
            int bit = ans.charAt(i) - '0';
            ans1 = ans1 * 2 + bit;
        }

        return ans1; 
    } 
}