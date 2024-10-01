class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
    int size =num.length-1;
    List<Integer> mylist=new ArrayList<Integer>();
    

    while(size>=0 || k>0){
        if(size>=0){
            k= k+ num[size];      
              }
           mylist.add(0,k%10);
           k=k/10;
           size--;

    }
    return mylist;


    }
}