class Solution {
      public boolean checkValidCuts(int n, int[][] rectangles) {
        int[][] X = new int[rectangles.length][2];
        int[][] Y = new int[rectangles.length][2];
        for (int i = 0; i < rectangles.length; i++) {
            X[i][0] = rectangles[i][0];
            Y[i][0] = rectangles[i][1];
            X[i][1] = rectangles[i][2];
            Y[i][1] = rectangles[i][3];
        }
        return check(X) || check(Y);
    }

    private boolean check(int[][] A) {
        int res = 0;
        Arrays.sort(A, (a, b) -> Integer.compare(a[0], b[0]));
        int pre = A[0][1];
        for (int[] ab : A) {
            int a = ab[0], b = ab[1];
            if (pre <= a) {
                res++;
            }
            pre = Math.max(pre, b);
        }
        return res > 1;
    }
}