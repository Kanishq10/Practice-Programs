"use strict";
let sales = 123456789;
let str = 'typescript';
let isEqual = true;
let hey;
// sales='Sandeep'; //gives error
let level1; //any type
level1 = 1;
level1 = 'Hello';
function dip(document) {
    console.log(document);
}
function display(document) {
    console.log(document);
}
let arr = [1, 2, 3]; //number type array
arr.forEach((n) => n);
let flexArray; //doesn't let data type input witout error
let barr = [];
let user = [1, "Sandeep"]; //tuples
let dev = [2, "hs", true];
console.log(dev);
// user.push()//give error due to readonly , otherwise it work
const [f, y] = user; //destructure
console.log(f + " " + y);
console.log(user);
const mysize = 2 /* Size.medium */;
console.log(1 /* Size.small */);
console.log(2 /* Size.medium */);
console.log(3 /* Size.large */);
