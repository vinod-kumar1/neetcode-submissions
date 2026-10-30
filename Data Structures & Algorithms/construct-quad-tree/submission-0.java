/*
// Definition for a QuadTree node.
class Node {
    public boolean val;
    public boolean isLeaf;
    public Node topLeft;
    public Node topRight;
    public Node bottomLeft;
    public Node bottomRight;

    
    public Node() {
        this.val = false;
        this.isLeaf = false;
        this.topLeft = null;
        this.topRight = null;
        this.bottomLeft = null;
        this.bottomRight = null;
    }
    
    public Node(boolean val, boolean isLeaf) {
        this.val = val;
        this.isLeaf = isLeaf;
        this.topLeft = null;
        this.topRight = null;
        this.bottomLeft = null;
        this.bottomRight = null;
    }
    
    public Node(boolean val, boolean isLeaf, Node topLeft, Node topRight, Node bottomLeft, Node bottomRight) {
        this.val = val;
        this.isLeaf = isLeaf;
        this.topLeft = topLeft;
        this.topRight = topRight;
        this.bottomLeft = bottomLeft;
        this.bottomRight = bottomRight;
    }
}
*/

class Solution {
    public Node construct(int[][] grid) {
        int n = grid.length, m = grid[0].length;
return checkGrid(grid , 0 , 0 , n , m);

    }

public Node checkGrid(int[][] A, int i , int j, int n, int m){

int num = A[i][j];
boolean valid = true;

        for(int k = i; k < n; k++){
            for(int l = j; l < m; l++){
if(num != A[k][l]){
 valid = false;
 break;
}
            }
        }

       if(valid) return new Node(num == 1 , true);

       Node node = new Node(num == 1 , false);
       int mr = i + (n - i) / 2 , mc = j + (m - j) / 2;
            node.topLeft = checkGrid(A , i , j , mr, mc);
            node.topRight = checkGrid(A , i , mc , mr , m);
            node.bottomLeft = checkGrid(A , mr , j , n, mc);
            node.bottomRight = checkGrid(A , mr, mc , n , m);
        return node;
        
        
    }
}