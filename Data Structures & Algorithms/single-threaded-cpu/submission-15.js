class Solution {
  /**
   * @param {number[][]} tasks
   * @return {number[]}
   */
  getOrder(tasks) {
    const available = new PriorityQueue((a, b) =>
      a[0] === b[0] ? a[1] - b[1] : a[0] - b[0]
    );
    const pending = new PriorityQueue((a, b) => a[0] - b[0]);

    tasks.forEach((task, i) => pending.enqueue([...task, i]));

    let time = 0;
    const res = [];
    while (!pending.isEmpty() || !available.isEmpty()) {
      while (!pending.isEmpty() && pending.front()[0] <= time) {
        // const [enqueueTime, processTime, i] = pending.dequeue();
        available.enqueue(pending.dequeue().slice(1));
      }

      if (available.isEmpty()) {
        time = pending.front()[0];
        continue;
      }

      const [processTime, i] = available.dequeue();
      time += processTime;
      res.push(i);
    }

    return res;
  }
}