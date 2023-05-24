let obj={
    name:"Udai",
    add:{
        Country:"India",
        state:{
            code:"Dl",
            pin:"111111"
        }
    }
}

let {name:firstname}=obj;
let {add:{Country:cont}}=obj
let {add:{state:{code:cd}}}=obj

console.log(firstname,cont,cd);