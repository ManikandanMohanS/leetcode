class Solution {
    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
           int goodEmploy=0;
       for(int i=0;i<hours.length;i++) {
        if(hours[i]>= target){
            goodEmploy++;
         }
       }
        return   goodEmploy;

    }
}