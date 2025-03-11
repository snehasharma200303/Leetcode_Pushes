class Solution {

    public long countOfSubstrings(String word, int k) {
        long count = 0;
        int start = 0;
        int end = 0;
        HashMap<Character, Integer> vcount = new HashMap<>();
        int c = 0;
        int[] nc = new int[word.length()];
        int ncIndex = word.length();
        for (int i = word.length() - 1; i >= 0; i--) {
            nc[i] = ncIndex;
            if (!isVowel(word.charAt(i))) {
                ncIndex = i;
            }
        }
        while (end < word.length()) {
            char newLetter = word.charAt(end);
            if (isVowel(newLetter)) {
                vcount.put(
                    newLetter,
                    vcount.getOrDefault(newLetter, 0) + 1
                );
            } else {
                c++;
            }
            while (c > k) {
                char stL = word.charAt(start);
                if (isVowel(stL)) {
                    vcount.put(
                        stL,
                        vcount.get(stL) - 1
                    );
                    if (vcount.get(stL) == 0) {
                        vcount.remove(stL);
                    }
                } else {
                    c--;
                }
                start++;
            }
            while (
                start < word.length() &&
                vcount.keySet().size() == 5 &&
                c == k
            ) {
                count += nc[end] - end;
                char stL = word.charAt(start);
                if (isVowel(stL)) {
                    vcount.put(
                        stL,
                        vcount.get(stL) - 1
                    );
                    if (vcount.get(stL) == 0) {
                        vcount.remove(stL);
                    }
                } else {
                    c--;
                }

                start++;
            }
            end++;
        }

        return count;
    }

    private boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}