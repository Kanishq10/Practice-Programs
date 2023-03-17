//ReadOnlyArray<T> 

let a: number[] =[1,2,3,4];
let ro: ReadonlyArray<number> =a;    //immutable array

//these will not work
// ro[0]=67;
// ro.push(78);

//also can't assign imutable array to mutable
// let a=ro;

//but there is an alternative
let z= ro as number[]