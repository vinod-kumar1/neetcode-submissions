class Solution {
    public void reverseNode(ListNode node) {
        ListNode prev = null, cur = node;
        while (cur != null) {
            ListNode temp = cur.next;
            cur.next = prev;
            prev = cur;
            cur = temp;
        }
    }

    public ListNode reverseKGroup(ListNode head, int k) {
    if(head == null || k == 1) return head;

    ListNode dummy = new ListNode(-1);
    dummy.next = head;
    ListNode cur = head, prev = dummy, nextGroup = null;
    
    while(cur != null){
        ListNode groupStart = cur;
        ListNode groupEnd = getKthNode(cur , k);


        if(groupEnd == null){
            prev.next = groupStart;
            break;
        }
nextGroup = groupEnd.next;
groupEnd.next = null;

        reverseNode(groupStart);
        prev.next = groupEnd;
        prev = groupStart;
        cur = nextGroup;
    }

return dummy.next;
    }

    public ListNode getKthNode(ListNode cur , int k){
    while(k > 1 && cur != null) {
        cur = cur.next;
        k--;
        }
    return cur;
    }
    
    }