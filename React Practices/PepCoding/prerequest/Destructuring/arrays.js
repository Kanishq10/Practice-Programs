let arr=["hi","am","Kanishq","Sharma","He He"]

console.log(arr[0], arr[1]);

//Destructuring is convenient way to extract values
// let [a,b,c,d]=arr
// let [a,b,,d]=arr    //skip some elements

let [a,b,c,d,,extra='Heloo']=arr    //default argument 
console.log(a,b,c,d,extra);