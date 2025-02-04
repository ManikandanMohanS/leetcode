class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int m=0;

        List<Integer> list=new ArrayList<Integer>();

    HashMap<Integer,Integer> map=new HashMap<>();

    for(int x:nums){ 
        
         map.put(x,map.getOrDefault(x,0)+1);
      }


  for(int x:map.keySet()){
    if(map.get(x)>nums.length/3){
     list.add(x);
     m=map.get(x);
     
     
    }
  }

 if(m==1&& list.isEmpty()){
  for(int x:nums){ 
       list.add(x); 
    }
 }
return list;

    }
}