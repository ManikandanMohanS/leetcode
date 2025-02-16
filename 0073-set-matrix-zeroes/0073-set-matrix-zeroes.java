class Solution {
    public void setZeroes(int[][] matrix) {
       int rowL=matrix.length;
       int colL=matrix[0].length;

       int row[]=new int[rowL];
       int col[]=new int[colL];
      
      for(int i=0;i<rowL;i++){
         for(int j=0;j<colL;j++){
            if(matrix[i][j]==0){
             row[i]=1;
             col[j]=1;
            }
          }
       }

  for(int i=0;i<rowL;i++){
         for(int j=0;j<colL;j++){
           if(row[i]==1|| col[j]==1)
                matrix[i][j]=0;
         }
     }

    }
}