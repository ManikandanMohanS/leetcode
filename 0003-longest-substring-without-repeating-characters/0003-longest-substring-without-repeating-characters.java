class Solution {
    public int lengthOfLongestSubstring(String s) {
      int start=0;
      int end=0;
      int maxL=0;
  Set<Character> set= new HashSet<>();

      while(end<s.length()){
       char ch=s.charAt(end);

         while(set.contains(ch)){
          set.remove(s.charAt(start));
           start++;
         }
       set.add(ch);
       int MaxWin=end-start+1;
       maxL=Math.max(maxL,MaxWin);
       end++;
   }  

      return maxL;
    }
}