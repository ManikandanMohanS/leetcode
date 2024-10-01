class Solution {
    public int diagonalSum(int[][] mat) {
      int sum=0  ;
      int size=mat.length-1;
      for(int i=0;i<=size;i++)
      {
        for(int j=0;j<=size;j++){
            if(i==j){
                sum=sum + mat[i][j];  
                  }
              
            else if(i+j==size)  {
                 sum=sum + mat[i][j]; 
            }
        }
      }
      return sum;
    }
}