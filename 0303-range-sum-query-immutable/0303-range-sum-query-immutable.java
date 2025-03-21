class NumArray {

    int prefix[];

    public NumArray(int[] nums) {
        prefix= new int[nums.length];
        prefix[0] = nums[0];
        for(int i=1;i<nums.length;i++){
            prefix[i] = nums[i] +prefix[i-1 ];
        } 
        this.prefix=prefix;
    }

    public int sumRange(int l, int r) {
        if(l==0){
            return prefix[r];
        }
        else
        return prefix[r]-prefix[l-1];
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */