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
     * @param {number} n
     * @return {ListNode}
     */
    removeNthFromEnd(head, n) {
        let res = new ListNode(0 , head);
        let f = res;
        let s = head;

        while(n > 0){
            s = s.next;
            n--;
        }

        while(s){
            s = s.next;
            f = f.next;
        }

console.log(f , s);
       f.next = f.next.next;

        return res.next;
    }
}
