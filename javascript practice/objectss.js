//object : group of key value pairs
// key-> value -> property
// key -> function -> method

let naruto={
    name:"naruto",
    lastname:"uzumaki",
    age:33,
    address:{
        origin:"japan",
        universe:"anime"
    },
    isShinobi:true,
    friends:["hinata","sasuke"],
    task:function(para){
        console.log("executing",para,"times");
    }
}

//get
console.log(naruto.name)
console.log(naruto.address)
console.log(naruto.address.origin)
naruto.task(23)
console.log(naruto)

//set
naruto.age=35;
naruto.wife="hinata";
naruto.friends[3]="shuinagami";
naruto.friends[5]="Sakura";
naruto.friends.push("sakuna");
console.log("-----------------------------------------------");
console.log(naruto);

//delete
delete naruto.name;
console.log(naruto);

//accessing with for loop
for(xkey in naruto){
    console.log(xkey);
}


console.log(naruto["age"]);
console.log(naruto["address"]);
