
//arrays it is a object
//it is special case of object
let arr=[1,2,3,4,5,6];
let i=0;
console.log(arr.indexOf(2));
console.log(arr.find((n)=>n%2==0),"from find");
console.log(arr.findIndex(n=> n%2!=0),"from findIndex");
while(i<arr.length){
    console.log(arr[i]);
    i++;
}

for(x in arr ){
    console.log(x,'hehe');
}
arr.push("hello");
arr.unshift("howdy");
console.log(arr.join(" "));
console.log('-------------------------------------------');
let arr2=arr.filter(x=>x<=3);     //array filter method ,output selected elements based on condition
console.log(arr2,'by filter');
console.log(...(arr.map(x=>x<=3)),'by map');
console.log(...(arr.map(x=>x*3)),'by map');   //return each element by modifying them
arr.forEach(myfunc);
function myfunc(item,index,arr){
    console.log(item,index,arr[index]);
}
let oddarr=arr.filter(function(x){
    return x%2!==0;
  });
console.log(oddarr);
console.log('-----------------------------------------');
arr.pop();
arr.shift();
console.log(...arr);    //... operator feed every element of array to console

console.log(...arr.slice(-3,-1));  //gives part of array,does not affect original
console.log(arr.slice(2,4));
arr.splice(2,4);     //delete part of array,affect original
console.log(...arr)
let sum =arr.reduce((accumulator,x)=>{
    return accumulator+x;
},0)  //starting with 0(accumulator)
console.log(sum);