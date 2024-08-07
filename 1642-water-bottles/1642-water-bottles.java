class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {

       int ans=0;
       int fullbottles=numBottles;
       int emptybottles=0;
       while(fullbottles>0){
        ans+=fullbottles;//drink
        //turn fullbottles into empty bottle
        emptybottles+=fullbottles;
        //exchange
        fullbottles=emptybottles/numExchange;
        //update empty bottles
        emptybottles=emptybottles%numExchange;



       }
       return ans; 
    }
}