class Solution {
    public int maxArea(int[] height) {
        int left=0;
        int right=height.length-1;
        int MaxArea=0;
       while(left<right){
         int area=Math.min(height[left],height[right])*(right-left);
         MaxArea=Math.max(MaxArea, area);
        if(height[left]>height[right])
           right--;

        else
          left++;  

       }
  return MaxArea;
    }
}