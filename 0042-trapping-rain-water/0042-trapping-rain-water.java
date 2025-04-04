class Solution {
    public int trap(int[] arr) {
        int total = 0;
        int n = arr.length;

        int[] leftMax = new int[n];

        leftMax[0] = arr[0];

        for(int i=1;i<n;i++)
        {
            leftMax[i] = Math.max(leftMax[i-1],arr[i]);
        }

        int[] rightMax = new int[n];

        rightMax[n-1] = arr[n-1];

        for(int i=n-2;i>=0;i--)
        {
            rightMax[i] = Math.max(rightMax[i+1],arr[i]);
        }



        for(int i=0;i<n;i++)
        {
            if(arr[i] < leftMax[i]&& arr[i] < rightMax[i])
            {
                total += Math.min(leftMax[i],rightMax[i]) - arr[i];
            }
        }

        return total;
    }
}