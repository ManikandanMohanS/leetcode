class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
     int result[][]=new int [image.length][image.length] ;
     for(int i=0;i <image.length; i++){
        int start=0;
        int end =image.length-1;

        while(start<=end){
            result[i][start]=image[i][end]^1;
             result[i][end]=image[i][start]^1;
             start++;
             end--;

        }
     }

    return result;
    }
}