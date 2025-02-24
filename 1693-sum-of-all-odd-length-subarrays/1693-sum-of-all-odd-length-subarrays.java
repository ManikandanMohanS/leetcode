// class Solution {
//     public int sumOddLengthSubarrays(int[] arr) {
//         int sum = 0;
//         for (int i = 0; i < arr.length; i++)
//             sum += (arr[i] * ((((i + 1) * (arr.length - i)) + 1) / 2));
//         return sum;
//     }
// }
class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int sum=0;
        for(int size=1;size<=arr.length;size+=2){
            for(int i=0;i<=arr.length-size;i++){
                for(int j=i;j<i+size;j++){
                    sum += arr[j];
                }
            }
        }
        return sum;
    }
}