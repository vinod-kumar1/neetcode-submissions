class Solution {
  /**
   * @param {number[]} asteroids
   * @return {number[]}
   */
  asteroidCollision(asteroids) {
    let stack = [];

    for (let i = 0; i < asteroids.length; i++) {
      let x = asteroids[i];
      let y = stack.at(-1);
      if (x < 0) {
        if (y < 0 || y == undefined) {
          stack.push(x);
        } else {
          if (x + y == 0) {
            stack.pop();
          } else if (Math.abs(x) > y) {
            stack.pop();
            i--;
          }
        }
      } else stack.push(x);
    }
    return stack;
  }
}