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
     * @param {ListNode} list1
     * @param {ListNode} list2
     * @return {ListNode}
     */
    mergeTwoLists(list1, list2) {
        let node= new ListNode(-1);
        let cur = node;
    while(list1 && list2){
if(list1.val > list2.val){
    let x = list2.next;
    list2.next = null;
    cur.next = list2;
    list2 = x;
}
else{
    let x = list1.next;
    list1.next = null;
    cur.next = list1;
    list1 = x;
}
cur = cur.next;
}
list1 ? cur.next = list1 : cur.next = list2;
return node.next;
}
}
