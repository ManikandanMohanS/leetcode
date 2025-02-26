class Solution {
    public String mostCommonWord(String p, String[] banned) {
p=p.toLowerCase();
        HashMap<String,Integer> map=new HashMap<>();
        p=p.replace(".","");
         p=p.replace(","," ");
          p=p.replace("?"," ");
           p=p.replace(";","");
            p=p.replace("!","");
             p=p.replace("'","");
        String[] s=p.split("\\s+");
         StringBuffer sb=new StringBuffer();
         for(int i=0;i<banned.length;i++){
            banned[i].toLowerCase();
           sb=sb.append(banned[i]);
          }
             
          for(int i=0;i<s.length;i++){
           
             if(!(sb.toString().contains(s[i]))){
               
             map.put(s[i],map.getOrDefault(s[i],0)+1);
             }
          }


String result="";
int max=0;
for(String s1:map.keySet() ){

    if(max<=map.get(s1))
        max=map.get(s1);
}
for(String s1:map.keySet() ){

    if(max==map.get(s1))
      result=s1;
}

return result;
    }
}