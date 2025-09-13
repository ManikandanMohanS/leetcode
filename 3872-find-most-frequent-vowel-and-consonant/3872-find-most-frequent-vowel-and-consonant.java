class Solution {
    public int maxFreqSum(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        char[] m=s.toCharArray();

        for(char a : m){
            map.put(a,map.getOrDefault(a,0)+1);
        }
int v=0,c=0;
for (Character key : map.keySet()) {
    int value = map.get(key);
  
  if(key=='a'||key=='e'||key=='i'||key=='o'||key=='u' ){
    v=Math.max(v,value);
  }
  else{
    c=Math.max(c,value);
  }
}

return v+c;

    }
}