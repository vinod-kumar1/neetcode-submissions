class Solution {
  /**
   * @param {string[]} tokens
   * @return {number}
   */
 evalRPN(tokens) {
    let ops = {
      "+": (b, a) => b + a,
      "-": (b, a) => b-a ,
      "*": (b, a) => b * a,
      "/": (b, a) => Math.trunc( b / a) ,
    };
 let stack = [];
for(let i=0; i < tokens.length; i++){
  let x = tokens[i];
  if(x in ops){
    let a = stack.pop();
    let b = stack.pop();
    stack.push(ops[x](b,a))
  }
  else stack.push(Number(x));
}
    
    return stack.pop();
  }
}