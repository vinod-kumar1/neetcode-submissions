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

public ListNode reverseNode(ListNode node){
if(node == null) return null;
ListNode prev = null;
ListNode cur = node;

while(cur != null){
    ListNode temp = cur.next;
    cur.next = prev;
    prev = cur;
    cur = temp;
}
return prev;
}

public int getNum(ListNode node){
    if(node == null) return 0;
   int sum = node.val;
    ListNode cur = node.next;
while(cur != null){
sum *= 10;
sum += cur.val;

cur = cur.next;
}
return sum;
}

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

ListNode out = new ListNode(-1);
ListNode res = out;

ListNode c1 = reverseNode(l1), c2 = reverseNode(l2);
if(c1.val == 0 && c2.val == 0) return new ListNode(0);
int n1 = getNum(c1);
int n2 = getNum(c2);
int sum = n1 + n2;

while(sum != 0){
    int n = sum % 10;
    res.next = new ListNode(n);
    res = res.next;
    sum /= 10;
}

return out.next;
    }
}
