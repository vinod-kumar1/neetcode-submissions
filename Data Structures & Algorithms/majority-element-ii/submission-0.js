class Solution {
    /**
     * @param {number[]} nums
     * @return {number[]}
     */
    majorityElement(nums) {
        let n1= -1, n2=-1, c1=0, c2=0;

for(let i=0; i< nums.length; i++){
    let x = nums[i];
    if(n1 == x) c1++;
    else if(n2 == x) c2++;
    else if(c1 == 0 ) {
        n1 = x;
        c1++;
    }
    else if(c2 == 0) {
        n2 = x;
        c2++;
    }
    else{
        c1--;
        c2--;
    }
}

c1=c2=0;
let res = [];

for(let i=0; i< nums.length; i++){
    let x = nums[i];
if(x == n1) c1++;
else if(x == n2) c2++;
}

if(c1 > (nums.length / 3)) res.push(n1);
if(c2 > (nums.length / 3)) res.push(n2);
return res;
    }
}
