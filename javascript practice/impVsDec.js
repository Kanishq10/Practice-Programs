//imperative way

// let x=5
// xsquare=x*x
// let iseven
// if(xsquare%2==0){
//     iseven=true;
// }
// else{
//     iseven=false;
// }

// console.log(iseven);


//declarative   use in functional programming 
let iseven=(x)=>((x*x)%2==0?true:false)
console.log(iseven(5))

//impure function
let a=10
function hey(b){
    console.log(a+b);
}
hey(23) //depends on a ,different value for same argument ,depend on external factor

//pure function   ,functional programming, same result for same set of arguments
function he(a,b){
    // console.log(a+b);  //side effect not allowed in functional programming
    return a+b;
}

he(2,3)

//mutable
const person={
    name:"Adam",
    rollno:23
}

const person2=person
console.log(person);
console.log(person2);
person2.name='heheboi'
//you can see here mutablity , it is due to referencing
console.log(person);
console.log(person2);

//mutable ,overcome this problem
const person3=Object.assign({},person);   //assigns new copy of old or
const person4={...person}        //spread operator
person3.name="noboi"
person4.name="hahahaboi"
console.log(person )
console.log(person3); 
console.log(person4);