class Solution {
    /**
     * @param {string} s
     * @return {boolean}
     */
    isValid(s){
        let i=0;
        let brackets = {
            "{" : "}",
            "(" : ")",
            "[" : "]"
        }
let openings = ["{", "[", "("];
let closings = ["}", "]", ")"];

let opens = [];
while(i < s.length){
    let x = s[i];
    if(openings.indexOf(x) != -1){
        opens.push(x);
        i++;
        continue;
        }
    if(closings.indexOf(x) != -1){
        if(brackets[opens.at(-1)] == x) opens.pop();

    else return false;
    } 

i++;
}
return !!!opens.length;
    }
}
