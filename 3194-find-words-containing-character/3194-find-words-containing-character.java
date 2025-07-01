import java.util.*;
class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
       List<Integer> l=new  ArrayList<Integer>();
       String key=""+x;
        for(int i=0;i<words.length;i++){
            String t=words[i];
            if(t.contains(key)){
         l.add(i);
            }
        }
    return l;
    }
}