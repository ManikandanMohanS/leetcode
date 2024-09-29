class Solution {
    public int[][] construct2DArray(int[] original, int m, int n) {

       if(m*n != original.length) return new int[][]{};


       int row=0;
       int column =0;
       int indexoriginalarr=0;

       int[][] ans =new int [m][n];

       while(row< m){
     column=0;
     while(column < n){

        ans[row][column]=original[indexoriginalarr++];
        column++;
     }
   row++;
       }

       return ans;
    }
}