class Solution {
    public String multiply(String num1, String num2) {
        int m=num1.length();
        int n=num2.length();

        int[] arr=new int[m+n];
        int carr=0;

        for(int i=m-1;i>=0;i--){
            for(int j=n-1;j>=0;j--){
                int digit1 = num1.charAt(i) - '0';
                int digit2 = num2.charAt(j) - '0';

                int prod = digit1 * digit2;
                int sum=arr[i+j+1]+prod;
                arr[i+j+1]=sum%10;//digit
                arr[i+j]+=sum/10;//carry
            }
        }

        StringBuilder sb=new StringBuilder();
        int i=0;
        while(i<arr.length && arr[i]==0){
            i++;
        }

        if(i==arr.length){
            return "0";
        }

        while(i<arr.length){
            sb.append(arr[i]);
            i++;
        }

        return sb.toString();
    }
}
