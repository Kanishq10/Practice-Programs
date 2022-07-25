let sqs='hello how are you';
let dqs="   hey i know you   ";

console.log(dqs.indexOf("i"),"shows index of given character");
console.log(sqs.charAt(3));
console.log(dqs.charCodeAt(1));
console.log(sqs.substring(2,6));
console.log(dqs.trim());
//split and join important
let arr=dqs.split(" ");   //split the string to array on the basis of character
console.log(sqs.split(""));

console.log(arr.join(""));   //join the array to string with given character