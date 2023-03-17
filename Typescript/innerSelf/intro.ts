let sales = 123456789;
let str: string= 'typescript';
let isEqual: boolean =true;
let hey:any;
// sales='Sandeep'; //gives error

let level1;     //any type
level1=1;
level1='Hello';

function dip(document:any){
    console.log(document);
}
function display(document:string){
    console.log(document);
}

let arr:number[] =[1,2,3]      //number type array
arr.forEach((n)=>n)

let flexArray:never[];   //doesn't let data type input witout error
let barr=[];


let user:readonly[number,string] =[1,"Sandeep"] //tuples
let dev:readonly[number,string,boolean]= [2,"hs",true]
console.log(dev);

// user.push()//give error due to readonly , otherwise it work

const [f,y]=user;  //destructure
console.log(f+" "+y);

console.log(user);


//enum
const enum Size {small=1, medium=2,large=3}
const mysize: Size= Size.medium;
console.log(Size.small);
console.log(Size.medium);
console.log(Size.large);


