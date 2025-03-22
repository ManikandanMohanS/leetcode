class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer>ans=new ArrayList<>();
        List<Integer>ans2=new ArrayList<>();
        List<Integer>ans3=new ArrayList<>();

        int m=matrix.length;
        int n=matrix[0].length; 
        for(int i=0;i<m;i++)
        {
            int min=Integer.MAX_VALUE;
            for(int j=0;j<n;j++)
            {
                if(matrix[i][j]<min)
                {
                    min=matrix[i][j];
                }
               
            }
                    ans.add(min);
        }
            for(int i=0;i<n;i++)
            {
                int max=Integer.MIN_VALUE;
                for(int j=0;j<m;j++)
                {
                     if(matrix[j][i]>max)
                     {
                         max=matrix[j][i];
                     }

                }
                ans2.add(max);
            }
        for(int i=0;i<m;i++)
        {
            int z=ans.get(i);
           if(ans2.contains(z))
           {
            ans3.add(z);
           } 
            
           
        }
        
            return ans3;
        
    }
}