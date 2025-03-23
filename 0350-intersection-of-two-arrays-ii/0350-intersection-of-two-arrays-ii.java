

class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> result = new ArrayList<>();

        // Count occurrences of each number in nums1
        for (int num : nums1) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // Check occurrences in nums2 and add to result list
        for (int num : nums2) {
            if (map.getOrDefault(num, 0) > 0) {
                result.add(num);  // Store common element
                map.put(num, map.get(num) - 1); // Decrease count
            }
        }

        // Convert ArrayList to int array
        int[] arr = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            arr[i] = result.get(i);
        }

        return arr;
    }
}
