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
     * @param {ListNode[]} lists
     * @return {ListNode}
     */
    mergeKLists(lists) {
        if(lists.length == 0 || !lists) return null;
        let out = [];

        for(let i=0; i < lists.length; i+=2){
            let l1 = lists[i];
            let l2 = i+1 < lists.length ? lists[i+1] : null; 
            out.push(this.mergeLists(l1,l2));
        }
if(out.length > 1) return this.mergeKLists(out);
else return out[0];
}

    mergeLists(l1,l2){
let node = new ListNode(0);
let cur = node;

while(l1 && l2){
    if(l1.val <= l2.val){
cur.next = l1;
l1 = l1.next;
    }
    else {
        cur.next = l2;
        l2 = l2.next;
    }
    cur = cur.next;
}
cur.next = l1 ? l1 : l2;
return node.next;
    }
}
