class Solution {
    public String reverseVowels(String s) {
        char arr[] = s.toCharArray();
        String vowels = "AEIOUaeiou";
        int start = 0, end = arr.length - 1;

        while (start < end) { 
            while (start < end && !vowels.contains(Character.toString(arr[start]))) {
                start++;
            }
           
            while (start < end && !vowels.contains(Character.toString(arr[end]))) {
                end--;
            }

        
            char temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
        return new String(arr);
    }
}
