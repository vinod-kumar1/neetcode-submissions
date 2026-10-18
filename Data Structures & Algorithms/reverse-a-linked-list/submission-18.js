/**
 * Definition for singly-linked list.
 * class ListNode {
 *     constructor(val = 0, next = null) {
 *         this.val = val;
 *         this.next = next;
 *     }
 * }
 */

class Solution {
    /**
     * @param {ListNode} head
     * @return {ListNode}
     */
    reverseList(head) {
        let cur = head;
        let temp = null;

        while(cur != null){
            let x = cur.next;
            let y = cur;
            y.next = null
if(temp == null) temp = y;
else{
    y.next = temp;
    temp = y;
}
cur = x;
            }
return temp;
    }
}
