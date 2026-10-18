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
    public ListNode mergeKLists(ListNode[] lists) {
       return divide(lists , 0, lists.length-1);

    }

public ListNode divide(ListNode[] lists, int l , int r){
    if(l > r) return null;
    if(l == r) return lists[l];

    int m = l + ((r-l)/2);

    ListNode left = divide(lists, l , m);
    ListNode right = divide(lists , m + 1 , r);

return concur(left , right);
}

public ListNode concur(ListNode A, ListNode B){
    ListNode res= new ListNode(-1);
    ListNode temp = res;

    while(A != null && B != null){
        if(A.val < B.val){
            ListNode next = A.next;
            A.next = null;
            temp.next = A;
        A = next;
        }
        else{
            ListNode next = B.next;
            B.next = null;
            temp.next = B;
        B = next;  
        }
        temp = temp.next;
    }

if(A != null) temp.next = A;
if(B != null) temp.next = B;

return res.next;

}

}
