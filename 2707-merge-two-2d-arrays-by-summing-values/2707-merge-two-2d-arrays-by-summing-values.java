class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
       

        Map<Integer,Integer> map=new HashMap<>();

         for(int i=0;i<nums1.length;i++){
            map.put(nums1[i][0],nums1[i][1]);
            
        }

         for(int i=0;i<nums2.length;i++){
          
                     if(map.containsKey(nums2[i][0])){
                      int t= map.get(nums2[i][0]);
                       map.put(nums2[i][0],nums2[i][1]+t);
                     }
                     else{
                        map.put(nums2[i][0],nums2[i][1]);
                     }
            
        }
Map<Integer, Integer> sortedMap = new TreeMap<>(map);
        int[][] array = convertMapTo2DArray(sortedMap);


        return array;
    }
     public static int[][] convertMapTo2DArray(Map<Integer, Integer> map) {
        int[][] array = new int[map.size()][2]; 
        int index = 0;

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            array[index][0] = entry.getKey();   
            array[index][1] = entry.getValue(); 
            index++;
        }

        return array;
    }
}