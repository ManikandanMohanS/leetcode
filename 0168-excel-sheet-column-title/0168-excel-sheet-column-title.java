class Solution {
    public String convertToTitle(int columnNumber) {
        String colTitle="";
        while(columnNumber>0){
            columnNumber--;
            colTitle=(char)((columnNumber%26)+'A')+colTitle;
            columnNumber=columnNumber/26;
        }
        return colTitle;
    }
}