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
     * @param {number} k
     * @return {ListNode}
     */



reverseNode(node){
    let temp = null;
let cur = node;

while(cur != null){
    let x = cur.next;
if(temp == null) {
    cur.next = null;
    temp = cur;
}else{
    cur.next = temp;
    temp =cur;
}
    cur = x;
}
return temp;
}

    reverseKGroup(head, k) {
        let cur = head;
        let out = new ListNode(-1);

function addToOut(node){
let temp = out;
while(temp.next != null){
    temp = temp.next;
}
temp.next = node;
}


        while(cur != null){
            let res = new ListNode(-1);
            let temp = res;
for(let i=0; i < k; i++){
if(!cur) break;

    let x = cur.next;
    cur.next = null;
    temp.next = cur;
    temp = temp.next;

if(k - 1 == i){
    i=-1;
    addToOut(this.reverseNode(res.next));
    res = new ListNode(-1);
    temp = res;
}
    cur = x;
}
if(res) addToOut(res.next);
// console.log(temp);
cur = null;
}
return out.next;
    }
}
