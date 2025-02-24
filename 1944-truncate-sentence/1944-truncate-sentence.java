class Solution {
    public String truncateSentence(String s, int k) {
      String[] str= s.split(" ");
      StringBuffer result=new StringBuffer("");
      for(int i=0;i<k;i++){
        result.append(str[i]+" ");
      }
      System.out.println(result);
      return result.toString().trim();
    }
}