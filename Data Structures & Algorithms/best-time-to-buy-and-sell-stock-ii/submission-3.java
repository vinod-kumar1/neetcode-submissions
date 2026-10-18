class Solution {
    public int maxProfit(int[] prices) {

int prof = 0;
int buy = prices[0];
int curProf = 0;

for(int i = 1; i < prices.length; i++){
    int n = prices[i];
    int temp = n - buy;

    if(temp < curProf){
            prof += curProf;
        curProf = 0;
        
            buy = n;
    }
    else curProf = Math.max(curProf, n - buy);
}

return prof + curProf;
    }
}