class Solution {

    public String encode(List<String> strs) {
    StringBuilder sb = new StringBuilder();

    for (String s : strs) {
        sb.append(s.length()).append('#').append(s);
    }

    return sb.toString();
}

    public List<String> decode(String str) {
          List<String> res = new ArrayList<>();
    int i = 0;

    while (i < str.length()) {
        int j = i;

        // find the '#' to extract length
        while (str.charAt(j) != '#') {
            j++;
        }

        // get length
        int len = Integer.parseInt(str.substring(i, j));

        // move to start of string
        j++;  

        // extract actual string
        String word = str.substring(j, j + len);
        res.add(word);

        // move pointer to next segment
        i = j + len;
    }

    return res;
    }
}
