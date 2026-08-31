class Solution {
    public boolean isAnagram(String s, String t) {   
        char[] sA = s.toCharArray();
        char[] tA = t.toCharArray();

        Arrays.sort(sA);
        Arrays.sort(tA);

        return  Arrays.equals(sA,tA);
    }
}
