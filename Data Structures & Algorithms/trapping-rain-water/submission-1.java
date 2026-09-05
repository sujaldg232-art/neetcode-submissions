class Solution {
    public int trap(int[] height) {
        if (height == null || height.length == 0) {
        return 0;
    }

    int[] lpre = new int[height.length];
    int[] rpre = new int[height.length];

    lpre[0] = 0;
    rpre[rpre.length - 1] = 0;
    int maxSoFar = 0;

    for (int i = 0; i < height.length - 1; i++) {
        maxSoFar = Math.max(maxSoFar, height[i]);
        lpre[i + 1] = maxSoFar;
    }

    int maxSoFar2 = 0;
    for (int i = rpre.length - 1; i > 0; i--) {
        maxSoFar2 = Math.max(maxSoFar2, height[i]);
        rpre[i - 1] = maxSoFar2;
    }

    int result = 0;

    for (int i = 0; i < height.length; i++) {
        int l = lpre[i];
        int r = rpre[i];
        if (Math.min(l, r) > height[i]) {
            result += (Math.min(l, r) - height[i]);
        }
    }

    return result;
    }
}
