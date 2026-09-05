class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) {
            return false;
        }

        HashMap<Character, Integer> s1Map = new HashMap<>();

        for (int i = 0; i < s1.length(); i++) {
            s1Map.put(s1.charAt(i), s1Map.getOrDefault(s1.charAt(i), 0) + 1);
        }

        int left = 0;
        int right = s1.length() - 1;

        while (right < s2.length()) {
            HashMap<Character, Integer> map = new HashMap<>();

            for (int i = left; i <= right; i++) {
                map.put(s2.charAt(i), map.getOrDefault(s2.charAt(i), 0) + 1);
            }

            if (s1Map.equals(map)) {
                return true;
            }

            left++;
            right++;
        }

        return false;
    }
}
