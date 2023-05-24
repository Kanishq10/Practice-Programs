let obj={
    name:"Ufai",
    add:{
        country:"India",
        state:{
            code:"D1",
            pin: "1111111"
        }
    }
}

// let obj2=obj;
// obj2.name="abcd";

// let obj2={...obj}    //spread operator
// obj2.name="abcd"
// obj2.add.country="Paki"   //it is also creating problem as inner object is referancing to same memory
//so we have also spread inner objects to it

let obj2={...obj,add:{...obj.add}};
obj2.name="Javed"
obj2.add.country="Bangala"
obj2.add.state.code="ff"   //here is also a problem
// so we have to further use spread operator
// let obj2={...obj,add:{...obj.add,state:{...obj.add.state}}}; 

// so there is a shortcut

let obj2=JSON.parse(JSON.stringify(obj))   //use this 
console.log(obj);
console.log(obj2);