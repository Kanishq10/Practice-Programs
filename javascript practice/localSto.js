//localStorage is an object
//no expiry date
//there is a similar object called sessional storage,which is same but remains only till session
let a=10;
localStorage.setItem("a","hello local");
localStorage.setItem("x",a);
localStorage.setItem(12,"hello local");
// localStorage.clear();
let b=localStorage.getItem("a");
console.log(localStorage.getItem("hrhrh"));
console.log(b);
//remove a specific item
localStorage.removeItem("x");
console.log(localStorage.length);
console.log(localStorage);

let arr=["bhindi","adrak","pyaaz"];
console.log(typeof(arr));
// localStorage.setItem("arr",arr);
localStorage.setItem("arr",JSON.stringify(arr));

let na=JSON.parse(localStorage.getItem("arr"));
console.log(na);