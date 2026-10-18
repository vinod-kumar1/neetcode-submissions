class Solution {
    /**
     * @param {number[]} nums1
     * @param {number[]} nums2
     * @return {number}
     */
    findMedianSortedArrays(nums1, nums2) {
        let res = [];
       if(!nums1.length && !nums2.length) return res;
        let temp = true;
let l=0, r=0;
while(temp && nums1.length && nums2.length){
if(nums1[l] > nums2[r]){
    res.push(nums2[r])
r++;
}
else if(nums1[l] < nums2[r]){
    res.push(nums1[l]);
    l++;
}
else{
    res.push(nums1[l] , nums2[r]);
    l++;r++;
}
if(!nums1[l] || !nums2[r]) temp = false;
}
res.push(...nums1.slice(l));
res.push(...nums2.slice(r));

console.log(res);
if(res.length % 2 != 0) return res[Math.floor(res.length / 2)]
else{
    let m = res.length / 2;
return (res[m] + res[m-1]) / 2
}

}
}
