class Solution {
    public boolean lemonadeChange(int[] bills) {
        
        int fivedollar=0;
        int tendollar=0;
        int twentydollar=0;

        for( int bill : bills){
            int amount= bill-5;

            int twentydollarneeded=Math.min(amount/20,twentydollar);
            amount-=(twentydollarneeded*20);
            twentydollar-=twentydollarneeded;

            int tendollarneeded=Math.min(amount/10,tendollar);
            amount-=(tendollarneeded*10);
            tendollar-=tendollarneeded;

             int fivedollarneeded=Math.min(amount/5,fivedollar);
            amount-=(fivedollarneeded*5);
            fivedollar-=fivedollarneeded;

            if(amount > 0) return false;
            if(bill==20) twentydollar+=1;
            else if(bill==10) tendollar+=1;
            else  fivedollar+=1;
        }  

        return true;           



        
    }
}