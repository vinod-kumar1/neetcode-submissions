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

if(change >= 20 && reg[2] > 0) change = sub(20 , 2, change, reg);
if(change >= 10 && reg[1] > 0) change = sub(10 , 1, change, reg);
if(change >= 5 && reg[0] > 0) change = sub(5 , 0, change, reg);

if(change > 0) return false;
            }

return true;
        }

public int sub(int bill , int counter, int change, int[] reg){

    if(change >= bill && reg[counter] > 0){

    int notes = change / bill;
    if(reg[counter] >= notes){
        change -= (notes * bill);
        reg[counter] -= notes;
    }
    else{
        change -= (reg[counter] * bill);
        reg[counter] = 0;
    }

}

return change;

}

    }