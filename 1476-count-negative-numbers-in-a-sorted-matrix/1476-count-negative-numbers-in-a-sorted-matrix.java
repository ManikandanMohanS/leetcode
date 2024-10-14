class Solution {
    public int countNegatives(int[][] grid) {
   int row = grid.length-1, col = grid[0].length,  count = 0, negativecount = 0;
        while (row >= 0 && count < col) {
            if (grid[row][count] < 0) {
                row--;
                negativecount=negativecount+ col - count; 
            }else {
                count++;
            }
        }
        return negativecount;
    }

    }
 