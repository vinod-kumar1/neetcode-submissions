class Solution {
    public boolean lemonadeChange(int[] bills) {
        
        int[] reg = new int[3];
HashMap<Integer, Integer> map = new HashMap<>();
map.put( 5 , 0);
map.put(10, 1);
map.put(20 , 2);
       
        for(int n : bills){
reg[map.get(n)]++;
            
            if( n == 5) continue;

int change = n - 5;
if(change >= 20 && reg[2] > 0){
    int notes = change / 20;
    if(reg[2] >= notes){
        change -= (notes * 20);
        reg[2] -= notes;
    }
    else{
        change -= (reg[2] * 20);
        reg[2] = 0;
    }
}

if(change >= 10 && reg[1] > 0){

    int notes = change / 10;
    if(reg[1] >= notes){
        change -= (notes * 10);
        reg[1] -= notes;
    }
    else{
        change -= (reg[1] * 10);
        reg[1] = 0;
    }

}

if(change >= 5 && reg[0] > 0){

    int notes = change / 5;
    if(reg[0] >= notes){
        change -= (notes * 5);
        reg[0] -= notes;
    }
    else{
        change -= (reg[0] * 5);
        reg[0] = 0;
    }

}

if(change > 0) return false;
            }

return true;
        }
    }