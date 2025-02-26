class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
    
      for(int i=0;i<heights.length-1;i++){

        for(int j=0;j<heights.length-i-1;j++){
             if(heights[j]>heights[j+1]){
                 String t=names[j];
                 names[j]=names[j+1];
                 names[j+1]=t;


                 int t1=heights[j];
                 heights[j]=heights[j+1];
                 heights[j+1]=t1;
               }
           }
      }


      String result[]=new String[names.length];
     for(int i=0;i<names.length;i++){
         result[i]=names[names.length-1-i];
         }

return result;
    }
}