class Solution {
public:
    int characterReplacement(std::string s, int k) {
        std::unordered_map<char, int> count;
        int left = 0;
        int maxLen = 0;

        for (int right = 0; right < s.length(); ++right) {
            count[s[right]]++;

            int maxFreq = 0;
            for (const auto& pair : count) {
                maxFreq = std::max(maxFreq, pair.second);
            }

            while ((right - left + 1) - maxFreq > k) {
                count[s[left]]--;
                left++;

                maxFreq = 0;
                for (const auto& pair : count) {
                    maxFreq = std::max(maxFreq, pair.second);
                }
            }

            maxLen = std::max(maxLen, right - left + 1);
        }

        return maxLen;
}
};
