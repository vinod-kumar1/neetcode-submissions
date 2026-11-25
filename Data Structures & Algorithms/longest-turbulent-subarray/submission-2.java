class Solution {
    public int maxTurbulenceSize(int[] arr) {
     int cur = 0, max = 0, ex = -1;

     for(int i = 0; i < arr.length - 1; i++){
int p = arr[i], c = arr[i + 1] ;

if(p == c){
    cur = 0;
    ex = -1;
}
else if(c > p){
    cur = ex == 1 ? cur+1 : 1;
    ex = 0;
}
else {
    cur = ex == 0 ? cur+1 : 1;
    ex = 1;
}

max = Math.max(max , cur);
     }

     return max + 1;
    }
}