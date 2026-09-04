class Solution {
   public int lengthOfLongestSubstring(String s) {
    int left = 0;
    int max = 0;
    HashMap<Character, Integer> map = new HashMap<>();

    for (int right = 0; right < s.length(); right++) {
        char rChar = s.charAt(right);
        map.put(rChar, map.getOrDefault(rChar, 0) + 1);

        while (map.get(rChar) > 1) {
            char lChar = s.charAt(left);
            map.put(lChar, map.get(lChar) - 1);
            left++;
        }

        max = Math.max(max, right - left + 1);
    }

    return max;
}
}
