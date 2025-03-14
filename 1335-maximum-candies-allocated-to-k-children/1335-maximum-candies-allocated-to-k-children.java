class Solution {
    public static int maximumCandies(int[] arr, long k) {
		Arrays.sort(arr);
		int low = 1;
		int right = arr[arr.length - 1];
		while (low <= right) {
			int mid = (right - low) / 2 + low;
			if (helper(arr, k, mid)) {
				low = mid + 1;
			} else {
				right = mid - 1;
			}
		}
		return right;
	}

	public static boolean helper(int[] arr, long k, int mid) {
		long curr = 0;
		for (int i = arr.length - 1; i >= 0 && curr < k; i--) {
			curr += arr[i] / mid;
		}
		return curr >= k;
	}
}