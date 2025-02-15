class Solution {
    public int[][] merge(int[][] intervals) {
        
        Arrays.sort(intervals,(a,b)-> a[0]-b[0]);
        int index=0;
        List<int[]> list=new ArrayList<>();
        while(index < intervals.length){
            int newStart=intervals[index][0];
            int curEnd=intervals[index][1];
             
             while(index<intervals.length-1 && curEnd >= intervals[index+1][0]){
                curEnd=Math.max(curEnd,intervals[index+1][1]);
                index++;
             }
    
          int newEnd=curEnd;
           list.add(new int[] {newStart,newEnd});
           index++;
       }

     int arrIndex=0;
      int arr[][]=new int[list.size()][2];
      for(int[]a :list){
        arr[arrIndex++]=a;
      }
   return arr;

    }

}