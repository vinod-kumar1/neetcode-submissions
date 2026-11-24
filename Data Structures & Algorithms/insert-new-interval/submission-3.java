class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        int num = newInterval[0];

        ArrayList<int[]> res = new ArrayList<>();

        for(int[] temp : intervals){
            int i = temp[0] , j = temp[1];
            if(i > num) {
                res.add(newInterval);
                res.add(temp);
            num = Integer.MAX_VALUE;
            }
            else res.add(temp);
        }

if(num != Integer.MAX_VALUE) res.add(newInterval);

int s = res.get(0)[0] , e = res.get(0)[1];
ArrayList<int[]> temp = new ArrayList<>();

for(int i = 1; i < res.size(); i++){
    int n1 = res.get(i)[0] , n2 = res.get(i)[1];
if((n1 >= s && n1 <= e) || (n2 >= s && n2 <= e) || (n1 < s && n2 > e)){
s = Math.min(s , n1);
e = Math.max(e , n2);
}
else{
temp.add(new int[] {s , e});
s = n1;
e = n2;
}

}
temp.add(new int[] {s , e});

int[][] out = new int[temp.size()][2];
int idx = 0;

for(int[] temp2 : temp) out[idx++] = temp2;

return out;

    }
}
