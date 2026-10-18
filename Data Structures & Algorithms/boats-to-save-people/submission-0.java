class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);

int l = 0, r = people.length - 1;
int boats = 0;

while( l <= r){
    if(l == r){
        boats++;
        break;
    }
    int lw = people[l], rw = people[r];

    int w = lw + rw;

    if(w <= limit) {
        boats++;
    l++;
    r--;
    }
    else{
     r--;
     boats++;
    }
}

return boats;
    }
}