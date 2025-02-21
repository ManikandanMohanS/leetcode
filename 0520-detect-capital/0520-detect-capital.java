class Solution {
    public boolean detectCapitalUse(String word) {
      int upperCount=0;
        for(int i=0;i<word.length();i++){
            char curChar=word.charAt(i);
              if(Character.isUpperCase(curChar))
                upperCount++;
        }
         
         char firstChar=word.charAt(0);
        if(upperCount==1 && Character.isUpperCase(firstChar) ){
            return true;
        }
        else if(upperCount== word.length() || upperCount==0){
            return true;
        }
        return false;
    }
}