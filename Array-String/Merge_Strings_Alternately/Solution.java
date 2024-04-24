class Solution {
    public String mergeAlternately(String word1, String word2) {
        int totalLength = word1.length() + word2.length();
        char[] merged = new char[totalLength];
        int i = 0, j = 0, k = 0;

        while (i < word1.length() || j < word2.length()) {
            if (i < word1.length()) {
                merged[k++] = word1.charAt(i++);
            }
            if (j < word2.length()) {
                merged[k++] = word2.charAt(j++);
            }
        }
        return new String(merged);
    }
}
