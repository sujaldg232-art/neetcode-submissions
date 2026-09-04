class Solution {
    public boolean isValid(String s) {
        Stack<Character> stck = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c == ')' || c == '}' || c == ']') {
                if (stck.isEmpty()) {
                    return false;
                }

                char top = stck.pop();
                if ((c == ')' && top != '(') ||
                    (c == '}' && top != '{') ||
                    (c == ']' && top != '[')) {
                    return false;
                }
            } else {
                stck.push(c);
            }
        }

        return stck.isEmpty();
    }
}
