// JavaScript Callbacks
// A callback is a function passed as an argument to another function.
// Where callbacks really shine are in asynchronous functions, where one function has to wait for another function (like waiting for a file to load).
// function display(some){
//     console.log(some);
// }

// function calc(n1,n2,callback){
//     let sum=n1+n2;
//     callback(sum);
// }

// calc(5,5,display);

function display(some){
    console.log(some);
}

function calc(n1,n2,callback){
    let sum=n1+n2;
    callback(sum);
}
setTimeout(calc,3000,5,5,display);   //callback is used most in the case of settimeinterval