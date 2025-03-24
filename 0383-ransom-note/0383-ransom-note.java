class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int alphaphet[] =new int[26];

        for(char c: magazine.toCharArray())
            alphaphet[c-'a']++;

        for(char c: ransomNote.toCharArray()){
            if(alphaphet[c-'a']==0){
                return false;
            }
            alphaphet[c-'a']--;
        }

        return true;
    }
}