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
let temp = new ListNode(-1);
      let res = temp;
        function run(node){
            if(node == null) return;
                run(node.next);
                let x = node;
                x.next = null;
        res.next = x;
        res = res.next;
        }
    run(head);
return temp.next;
    }
}
