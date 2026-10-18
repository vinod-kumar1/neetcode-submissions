class Solution {
    public List<List<Integer>> permute(int[] nums) {
      List<Integer> temp = new ArrayList<>();
      List<List<Integer>> res = new ArrayList<>();
      res.add(new ArrayList<>(temp));

      dfs(nums , 0, temp , res);
      return res;
    }

    public void dfs(int[] nums , int n , List<Integer> temp , List<List<Integer>> res){
if(n >= nums.length) return;
dfs(nums , n+1 , temp , res);
addItems(nums[n] , res);
    }

    public void addItems( int n , List<List<Integer>> res){
List<List<Integer>> out = new ArrayList<>();

for(int i=0; i < res.size(); i++){
    for(int j=0; j <= res.get(i).size(); j++){
ArrayList<Integer> cp = new ArrayList<>(res.get(i));
cp.add(j , n);
out.add(cp);
    }
}
while(res.size() > 0) res.remove(0);
while(out.size() > 0) res.add(out.remove(0));

    }
}
