class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
       StringBuffer w1=new  StringBuffer("");
        StringBuffer w2=new  StringBuffer("");

        for(int i=0;i<word1.length;i++){
            w1=w1.append(word1[i]);
        }
        
         for(int i=0;i<word2.length;i++){
            w2=w2.append(word2[i]);
        }
       
        if(w1.toString().equals(w2.toString())){
          return true;
       }
        return false;  
  }
}