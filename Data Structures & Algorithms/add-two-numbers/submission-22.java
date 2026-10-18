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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode res = new ListNode(-1);
        ListNode tail = res;

        ListNode A = l1;
        ListNode B = l2;

        ListNode cur = l1;
        // while(cur != null){
        //     ListNode next = cur.next;
        //     cur.next = A;
        //     A = cur;
        //     cur = next;
        // }
        // cur = l2;
        // while(cur != null){
        //     ListNode next = cur.next;
        //     cur.next = B;
        //     B = cur;
        //     cur = next;
        // }

        int carry = 0;

while(A != null || B != null){
    int sum = (A == null ? 0 : A.val) + (B == null ? 0 : B.val);
    sum += carry;
    carry = 0;

    if(sum >= 10){
     carry = sum / 10;
     sum %= 10;
    }

     tail.next = new ListNode(sum);
     tail = tail.next;
    
if(A != null) A = A.next;
if(B != null) B = B.next;
}

if(carry > 0){
    tail.next = new ListNode(carry);
    tail = tail.next;
}

return res.next;

// ListNode out = null;
// cur = res.next;

// while(cur != null){
//     ListNode next = cur.next;
//     cur.next = out;
//     out = cur;
//     cur = next;
// }

// return out;
    }
}
