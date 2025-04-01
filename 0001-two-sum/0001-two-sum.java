// class Solution {
//     public int[] twoSum(int[] nums, int target) {
//         int[] arr=new int[2];
//         for(int i=0;i<nums.length;i++)
//         {
//             for(int j=i+1;j<nums.length;j++)
//             {
//                 if(nums[i]+nums[j]==target)
//                 {
//                     arr[0]=i;
//                     arr[1]=j;
//                     break;
//                 }
//             }
//         }
//         return arr;
//     }
// }
class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numMap = new HashMap<>();
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            int complement = target - nums[i];
            if (numMap.containsKey(complement)) {
                return new int[]{numMap.get(complement), i};
            }
            numMap.put(nums[i], i);
        }

        return new int[]{}; // No solution found
    }
}