class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
           

        int n=nums.length;
        Deque<Integer> q = new ArrayDeque<>();
        int[] ans= new int[n-k+1];
        int ans_index=0;

        for( int i=0; i<n; i++){

          
            while( q.isEmpty()==false && q.peek()<i-k+1){
                q.poll();
            }

            
            while (q.isEmpty()==false && nums[i]>nums[q.peekLast()]){
                q.pollLast();
            }

           
            q.add(i);

         
            if( i>=k-1){
                ans[ans_index++]=nums[q.peek()];
            }
        }
        
        return ans;
    
    }
}