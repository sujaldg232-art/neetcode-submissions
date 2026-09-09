class Solution {
public:
    string longestCommonPrefix(vector<string>& strs) {
        
    string prefix = strs[0];

    for(int i = 1; i < strs.size();i++){
        string tst = strs[i];

        int noOfMatches = 0;
        for(int i = 0; i < prefix.size();i++){
            if(prefix[i] == tst[i]){
                noOfMatches++;

            }else{
                break;
            }
        }

        if(noOfMatches == 0 ) return "";
        else{
            prefix = prefix.substr(0,noOfMatches);
        }
    }

    return prefix;
    }
};