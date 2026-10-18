class Solution {
  /**
   * @param {character[][]} board
   * @param {string} word
   * @return {boolean}
   */
  exist(board, word) {
    let k = 0;
    let rows = board.length;
    let cols = board[0].length;
    let visited = {};

    function run(r, c, i) {
      if (i >= word.length) return true;
      let curWord = word[i];
      if (
        r < 0 ||
        r >= rows ||
        c < 0 ||
        c > cols.length ||
        curWord != board[r][c] ||
        (`${r},${c}` in visited)
      )
        return false;
      visited[`${r},${c}`] = 1;
      let res =
        run(r - 1, c, i + 1) ||
        run(r + 1, c, i + 1) ||
        run(r, c + 1, i + 1) ||
        run(r , c - 1, i + 1);
              delete visited[`${r},${c}`];
      return res;
    }

    for (let i = 0; i < board.length; i++) {
      for (let j = 0; j < board[i].length; j++) {
        if (run(i, j, k)) return true;
      }
    }
    return false;
  }
}