class Solution {
  /**
   * @param {ListNode} head
   * @return {void}
   */
  reorderList(head) {
    let cur = head;
    let out = new ListNode(-1);
    let res = out;
    let fn = head;
    let temp = false;

    function run(ln) {
      if (ln.next) run(ln.next);
      if (temp) return;

      let y = fn.next;
      fn.next = null;
      res.next = fn;
      res = res.next;
      if (fn == ln) {
        temp = true;
        return;
      }
      fn = y;

      let z = ln;
      ln.next = null;
      res.next = ln;
      res = res.next;
      if (fn == z) {
        temp = true;
        return;
      }
    }
    run(cur);
    return out.next;
  }
}
