class Solution {
    public int distributeCandies(int n, int limit) {
           int count=0,sum=0;
        for(int x=0;x<=limit;x++){
            for( int y=0;y<=limit;y++){
                for(int z=0;z<=limit;z++){
                    sum=x+y+z;
                    if(sum==n){
                        count++;
                    }
                }
            }
        }return count;
    }
}