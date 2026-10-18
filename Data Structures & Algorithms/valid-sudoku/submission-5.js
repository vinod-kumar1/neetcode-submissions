class Solution {
  /**
   * @param {character[][]} board
   * @return {boolean}
   */
  isValidSudoku(board) {
    // row check
    for (let i = 0; i < board.length; i++) {
      let seen = new Set();
      for (let j = 0; j < board.length; j++) {
        if (board[i][j] == ".") continue;
        if (seen.has(board[i][j])) return false;
        else seen.add(board[i][j]);
      }
    }

    // column check
    for (let col = 0; col < board[0].length; col++) {
      let seen = new Set();
      for (let row = 0; row < board.length; row++) {
        let term = board[row][col];
        if (term == ".") continue;
        if (seen.has(term)) return false;
        else seen.add(term);
      }
    }

    // box check

    for (let sq = 0; sq < 9; sq++) {
      let seen = new Set();
      for (let i = 0; i < 3; i++) {
        for (let j = 0; j < 3; j++) {
          let row = Math.floor(sq / 3) * 3 + i;
          let col = (sq % 3) * 3 + j;
          let term = board[row][col];
          if (term == ".") continue;
          if (seen.has(term)) return false;
          else seen.add(term);
        }
      }
    }
    return true;
  }
}

