class Solution {

    public String encode(List<String> strs) {
        StringBuilder enString = new StringBuilder();
        for (String str : strs) {
            enString.append(str.length()).append("#").append(str);
        }
        return enString.toString();
    }

    public List<String> decode(String str) {
        List<String> alString = new ArrayList<>();
        int i = 0;
        while (i < str.length()) {
            int j = i;
            while (str.charAt(j) != '#') {
                j++;
            }
            int length = Integer.parseInt(str.substring(i, j));
            i = j + 1;
            j = i + length;
            alString.add(str.substring(i, j));
            i = j;
        }
        return alString;
    }
}
