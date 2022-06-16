//Everything is object or primitives in javascript


let naruto={
    name:"naruto",
    lastname:"uzumaki",
    age:33,
    address:{
        origin:"japan",
        universe:"anime"
    },
    isShinobi:true,
    friends:["hinata","sasuke"],
    task:function(para){
        console.log("executing",para,"times");
    }
}

console.log(naruto.name)
console.log(naruto.address)
console.log(naruto.address.origin)
naruto.task(23)
console.log(naruto)

//let us see about functions and arrays
let arr=[1,2,3,4,5,6,7,8,9];
arr.prop=function print(){
    console.log('hello I am inside the array');
}
arr.write="just writing ,writing ";
console.log(arr);
for(x in arr){
    console.log(x," : ",arr[x]);
}

arr[100]=230;
console.log(...arr);
console.log(arr);
console.log('----------------------------------------------------------------');

function fx(){
    console.log("hello I am a function");
}

fx.property=function myfn(){console.log("I am property of function");}
fx.number=10;

fx();
fx.property();
console.log(fx.number);
console.log(fx);
//so from above examples we can see that all are objects