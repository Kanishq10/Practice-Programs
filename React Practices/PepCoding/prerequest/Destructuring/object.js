let obj={
    name:"Kanishq",
    aim:"High",
    country:"India"
}

console.log(obj.name,obj["aim"]);

//Destructuring
// let {name,aim,cont,state}=obj
let {name,aim,country,state="Punjab"}=obj
let {name:yup}=obj   //renaming
console.log(name,aim,country,state);
console.log(yup);