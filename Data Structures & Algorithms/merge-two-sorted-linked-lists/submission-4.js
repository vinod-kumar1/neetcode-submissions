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
    cur.next = list2;
    list2 = list2.next;
}
else{
    cur.next = list1;
    list1 = list1.next;
}
cur = cur.next;
}
list1 ? cur.next = list1 : cur.next = list2;
return node.next;
}
}
