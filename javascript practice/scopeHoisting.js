//hoisting
// JavaScript Declarations are Hoisted
// In JavaScript, a variable can be declared after it has been used.

// In other words; a variable can be used before it has been declared.


var x=10;
var x=12;
var fr='orange';
console.log(fr);
{
    fr='apple';
    console.log(fr);
}
console.log(fr);

function real(){
    console.log("I am the real me😁😁");
}
real();
function real(){
    console.log("No I am the real one😘😘");
}

function real(){
    console.log("you both are wasted  (❁´◡`❁)");
}

console.log(this);
console.log(global);

a=5;
console.log(a);
var a=10;
console.log(a);
//redeclare
var a;
console.log(a);

fn();
function fn(){
    console.log("i can be called anywhere");
}

fn();


console.log('--------------------------------------------------');
console.log(bell);
var bell=10;
console.log(bell);
var bl=['hello','how are you',12];
console.log(bl);
function bb(){
    console.log(bell);
    console.log(bl);
    var bell=20;  
    console.log(bell);
    bc();
    function bd(){
        console.log(bell,'from bd');
        console.log(bl,'from bd');
    }
    bd();
}
bb();

function bc(){
    console.log(bl,'from bc');
    console.log(bell,'from bc');
}


