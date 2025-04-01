class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set=new HashSet<>();
         HashSet<Integer> result_set=new HashSet<>();


         for(int i=0;i<nums1.length;i++){
            set.add(nums1[i]);
         }

         for(int i=0;i<nums2.length;i++){
            if(set.contains(nums2[i])){
                result_set.add(nums2[i]);
            }
         }
 int[] array = result_set.stream().mapToInt(Integer::intValue).toArray();


         return array;
    }
    }
