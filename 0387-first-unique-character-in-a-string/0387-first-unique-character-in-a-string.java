class Solution {
    public int firstUniqChar(String s) {
        char ch[]=s.toCharArray();
       LinkedHashMap<Character,Integer> map=new LinkedHashMap<>();
       for(int i=0;i<ch.length;i++){
        map.put(ch[i],map.getOrDefault(ch[i],0)+1);
       }
      char result=' ';
      for (Character key : map.keySet()) {
       if( map.get(key)==1){
           result=key;
           break;
      }
    }
      for(int i=0;i<ch.length;i++){
        if(result==ch[i])
            return i;
      }


     return -1;
    }
}