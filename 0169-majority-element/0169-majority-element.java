class Solution {
    public int majorityElement(int[] nums) {
          /*  int currentElement=nums[0];
    int count=1;


    for(int i=1;i<nums.length; i++){
        if(count ==0){
           currentElement=nums[i];
           count=1; 
        }
        else if (nums[i]==currentElement){
            count++;
            
        }
        else {
            count--;
        }
    }    

return currentElement;*/
int m=0;
 HashMap<Integer,Integer> map=new HashMap<>();

    for(int x:nums){ 
         map.put(x,map.getOrDefault(x,0)+1);
      }


  for(int x:map.keySet()){
    if(map.get(x)>nums.length/2){
    m=x;
    }
  }

return m;

    }
}