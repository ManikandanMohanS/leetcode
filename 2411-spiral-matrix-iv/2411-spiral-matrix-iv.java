/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int[][] spiralMatrix(int m, int n, ListNode head) {
        int a[][]=new int [m][n];
int r=0;
int c=0;
int re=m-1;
int ce=n-1;
while(r<=re && c<=ce){

for(int j=c;j<=ce;j++){
               
               if(head!=null){
                a[r][j]=head.val;
                head=head.next;
                }
                else{
                    a[r][j]=-1;
                }
                
            }

r++;


for(int j=r;j<=re;j++){
               
               if(head!=null){
                a[j][ce]=head.val;
                head=head.next;
                }
                else{
                    a[j][ce]=-1;
                }
                
            }


ce--;


if(r<=re){
for(int j=ce;j>=c;j--){
               
               if(head!=null){
                a[re][j]=head.val;
                head=head.next;
                }
                else{
                    a[re][j]=-1;
                }
                
            }

}
re--;


if(c<=ce){
for(int j=re;j>=r;j--){
               
               if(head!=null){
                a[j][c]=head.val;
                head=head.next;
                }
                else{
                    a[j][c]=-1;
                }
                
            }

}
c++;


}

   return a;

    }
}