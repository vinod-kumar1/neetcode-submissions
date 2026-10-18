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
int c = 0;
ListNode res = new ListNode(-1);
ListNode tail = res;

     while(l1 != null && l2 != null){
        
int sum = l1.val + l2.val + c;
c = 0;
int val = sum;

if(sum >= 10){
    int n = sum % 10;
    val = sum % 10;
 sum -= (sum % 10);
 sum /= 10;
 c = sum;
}
tail.next = new ListNode(val);
tail = tail.next;
             
             l1 = l1.next;
             l2 = l2.next;
             }   


ListNode temp = null;
if(l1 != null) temp = l1;
if(l2 != null) temp = l2;

while(temp != null){
    int sum = temp.val + c;
    c = 0;
    int val = sum;

    if(sum >= 10){
            int n = sum % 10;
    val = sum % 10;
 sum -= (sum % 10);
 sum /= 10;
 c = sum;
    }
    tail.next = new ListNode(val);
    tail = tail.next;
temp = temp.next;
}

if(c > 0){
tail.next = new ListNode(c);
tail = tail.next;
}

return res.next;

    }
}
