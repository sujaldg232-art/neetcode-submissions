class Solution {
    public String encode(List<String> strs) {
    StringBuilder res = new StringBuilder();

    for (int i = 0; i < strs.size(); i++) {
        res.append(strs.get(i).length()).append("#").append(strs.get(i));
    }
    return res.toString();
}

public List<String> decode(String str) {
    List<String> res = new ArrayList<>();
    int i = 0;

    while (i < str.length()) {
        int delimiterIndex = str.indexOf('#', i);
        int num = Integer.parseInt(str.substring(i, delimiterIndex));
        i = delimiterIndex + 1;

        int k = 0;
        StringBuilder strsToBeAdded = new StringBuilder();
        while (k < num) {
            strsToBeAdded.append(str.charAt(i));
            i++;
            k++;
        }
        res.add(strsToBeAdded.toString());
    }
    return res;
}
}
