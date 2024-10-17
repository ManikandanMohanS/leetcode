class Solution {
    public int lengthOfLastWord(String s) {
       s= s.trim();
        int ctr=0;

       char ch[]=s.toCharArray();
       for(int i=ch.length-1;i>=0;i--){
        if(ch[i]==' '){
            break;
        }
        ctr++;
       } 
       return ctr;
    }
}