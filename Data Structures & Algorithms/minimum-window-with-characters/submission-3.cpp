class Solution {
public:
std::string minWindow(std::string s, std::string t) {
    if (s.length() < t.length()) return "";

    std::unordered_map<char, int> mapT;
    for (char c : t) {
        mapT[c]++;
    }

    std::unordered_map<char, int> windowCounts;
    int requiredUnique = mapT.size();
    int formed = 0;

    int minLen = 1e9;
    int startIdx = 0;

    int left = 0;
    for (int right = 0; right < s.length(); right++) {
        char c = s[right];
        windowCounts[c]++;

        if (mapT.count(c) && windowCounts[c] == mapT[c]) {
            formed++;
        }

        while (left <= right && formed == requiredUnique) {
            int currentLen = right - left + 1;
            if (currentLen < minLen) {
                minLen = currentLen;
                startIdx = left;
            }

            char leftChar = s[left];
            windowCounts[leftChar]--;

            if (mapT.count(leftChar) && windowCounts[leftChar] < mapT[leftChar]) {
                formed--;
            }

            left++;
        }
    }

    return (minLen == 1e9) ? "" : s.substr(startIdx, minLen);
}
};
