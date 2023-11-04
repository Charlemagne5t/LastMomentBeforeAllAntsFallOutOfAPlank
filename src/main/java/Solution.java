public class Solution {
    public int getLastMoment(int n, int[] left, int[] right) {
        int leftMax = 0;
        int rightMin = Integer.MAX_VALUE;
        if(right.length != 0){
            for (int j : right) {
                rightMin = Math.min(rightMin, j);
            }

        }
        if(left.length != 0){
            for (int j : left) {
                leftMax = Math.max(leftMax, j);
            }
        }
        if(left.length == 0) {
            return n - rightMin;
        }
        if(right.length == 0){
            return leftMax;
        }
        return Math.max(n - rightMin, leftMax);
    }
}
