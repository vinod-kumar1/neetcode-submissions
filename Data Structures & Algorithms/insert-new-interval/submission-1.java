class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
         int n = intervals.length;
        List<int[]> res = new ArrayList<>();
    int s = newInterval[0], e = newInterval[1];

    for(int temp[] : intervals){
        int st = temp[0], ed = temp[1];
        if(s < st){
        res.add(new int[] {s , e});
        s = Integer.MAX_VALUE;
        }
        res.add(new int[] {st , ed});
    }

if(s == newInterval[0]) res.add(new int[] {s , e});

s = res.get(0)[0];
e = res.get(0)[1];

ArrayList<int[]> out = new ArrayList<>();

for(int i=1; i < res.size(); i++){
    int st = res.get(i)[0], ed = res.get(i)[1];
    if((s >= st && s <= ed) || (e >= st && e <= ed) || (s < st && e > ed)){
        e = Math.max(e , ed);
    }
    else{
out.add(new int[] {s , e});
s = st;
e = ed;
    }
}
out.add(new int[] {s , e});

int[][] out2 = new int[out.size()][2];
int idx = 0;

for(int[] temp : out) out2[idx++] = new int[] {temp[0] , temp[1]};

return out2;

    }
}
