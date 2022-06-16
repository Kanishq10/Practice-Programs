//functions are called first class citizens because
// functions can be treated as variable
//here funx variable contains address of citi function
let funx= function citi(){
    console.log('this is function returned as variable');
}
funx();

//Anonymous function: function with no name
let funss= function(){
    console.log('this is function returned as variable and is anonymous variable');
}
funss();

//IIFE function : immedietly invoked function expression
//provides all the features beforehead
//functions are called immedietly when they are made
(function fn(){
    console.log("This is an iife function");
})();

//arrow function breakdown the syntax ,soul of react
// let fpp=(num)=>{
//     console.log("arrow function",num*num);
// }
let fpp=num=>console.log("arrow function",num*num);

//first class citizens
//functions that are treated as variables
//assignment -> functions expressions
//variable are passed as parameters
//functions can also be passed as parameters

function sayHello(param){
    console.log('hello',param);
    return 'parabal';
}
function isSmaller(){
    console.log("isSmaller function");
    return 20;
}

let rval=sayHello(isSmaller);
console.log(rval);

//4. variables can be returned from functions
//5. functions can also be returned from functions

 function outer(){
     console.log("This is outer function");
     return function inner(){
         console.log("inner function");
     }
}
let value=outer();
console.log(value);