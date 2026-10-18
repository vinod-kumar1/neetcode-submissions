class Solution {
  /**
   * @param {ListNode} head
   * @return {void}
   */
  reorderList(head) {
    let cur = head;
    let out = new ListNode(-1);
    let res = out;
    let fcur = head;
    let temp = false;

    function run(node) {
      // append from begining
      if (node.next) run(node.next);
      if (temp) return;
      let y = fcur.next;
      fcur.next = null;
      res.next = fcur;
      res = res.next;
      if (node == fcur) {
        temp = true;
        return;
      }
      fcur = y;

      if (fcur == node) temp = true;

      node.next = null;
      res.next = node;
      res = res.next;
      if (temp) return;
    }

    run(cur);

    return JSON.stringify(out.next, null, 2);
  }
}
