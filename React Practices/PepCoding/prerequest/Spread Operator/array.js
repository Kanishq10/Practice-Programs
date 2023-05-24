// let arr=[1,2,3]

// let arr2= arr;    //point to memory of arr

// arr2.push(4);

// console.log(arr);   //arr variable is in stack memory and its data is in heap memory
// console.log(arr2);  
//this problem can be solved by spread operator

let arr=[1,2,3,4]
let arr2=[...arr] //now we will use spread operator which generate a list 

arr2.push(5)

console.log(arr);
console.log(arr2);  