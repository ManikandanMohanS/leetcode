class Solution {
    public int heightChecker(int[] heights) {
        int correctHeight[]=Arrays.copyOf(heights,heights.length);
        Arrays.sort(correctHeight);
        int misMatch=0;
        for(int i=0;i<correctHeight.length;i++){
            if(correctHeight[i]!=heights[i]){
                misMatch++;
            }
        }

        return misMatch;
    }
}