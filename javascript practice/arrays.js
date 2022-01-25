
//arrays
let arr=[1,2,3,4,5,6];
let i=0;
while(i<arr.length){
    console.log(arr[i]);
    i++;
}

arr.push("hello");
arr.unshift("howdy");
console.log(arr.join(" "));


arr.pop();
arr.shift();
console.log(...arr);    //... operator feed every element of array to console

console.log(...arr.slice(-3,-1));  //gives part of array,does not affect original
console.log(arr.slice(2,4));
arr.splice(2,4);     //delete part of array,affect original
console.log(...arr)
