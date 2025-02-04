class Solution {
    public int[][] largestLocal(int[][] grid) {
        int n=grid.length;
        int max=0;
        int res[][]=new int[n-2][n-2];
        for(int i=0; i<n-2; i++)
        {
            for(int j=0; j<n-2; j++)
            {
                max=0;
                for(int k=i; k<i+3; k++)
                {
                    for(int l=j; l<j+3; l++){
                        max=Math.max(max,grid[k][l]);
                    }

                }
                res[i][j]=max;
            }
        }
        return res;
    }
    }
