class Solution {
    public List<String> readBinaryWatch(int turnedOn) {
     List<String> result = new ArrayList<String>();
     for(int  i=0;i<=763;i++)
     {
        int k=i;
        int currentones=0;
        int firstfour=i  >> 6;
        int lastsix=i & 63;
        if(firstfour>11 || lastsix >59)  continue;
        while(k>0){
            if(k%2== 1) currentones ++;
            k=k>>1;

        }   
        if(currentones==turnedOn) {

            result.add(firstfour +":" +(lastsix< 10 ? "0"+ lastsix : lastsix));

        }

     }
     return result;

    }
}